# Configuração do Tailscale no TrueNAS SCALE

## Objetivo

Conectar o servidor TrueNAS a uma rede privada Tailscale, permitindo acesso remoto seguro ao painel e aos compartilhamentos sem abrir diretamente as portas do servidor na internet.

## Requisitos

- TrueNAS SCALE com acesso administrativo;
- conta Tailscale;
- acesso administrativo à tailnet;
- aplicativo Tailscale instalado no computador que fará o acesso remoto.

## 1. Criar a Auth Key

1. acessar o [painel de chaves do Tailscale](https://login.tailscale.com/admin/settings/keys);
2. clicar em **Generate auth key**;
3. adicionar uma descrição, como `TrueNAS-Servidor`;
4. para apenas um servidor, preferir uma chave de uso único;
5. se a aprovação de dispositivos estiver ativa, marcar **Pre-approved**;
6. opcionalmente, associar uma tag própria para servidores;
7. clicar em **Generate key**;
8. copiar a chave e guardá-la temporariamente em local seguro.

> A Auth Key é uma credencial secreta. Nunca publique a chave no GitHub, em capturas de tela ou em arquivos de documentação. Se ela for exposta, revogue-a imediatamente e gere outra.

Exemplo apenas ilustrativo:

```text
tskey-auth-EXEMPLO_NAO_UTILIZAR
```

## 2. Instalar o aplicativo no TrueNAS

1. entrar na interface web do TrueNAS SCALE;
2. abrir **Apps**;
3. selecionar **Discover Apps** ou procurar pelos aplicativos disponíveis;
4. pesquisar por **Tailscale**;
5. selecionar o aplicativo oficial e clicar em **Install**.

## 3. Preencher a configuração

Na tela do aplicativo:

1. em **Auth Key**, colar a chave criada;
2. em **Hostname**, definir um nome fácil, como `truenas-servidor`;
3. salvar e aguardar o estado **Running**;
4. abrir o painel **Machines** do Tailscale e confirmar que o TrueNAS apareceu.

A documentação oficial básica recomenda **Userspace** durante a instalação inicial. Para acessar diretamente serviços hospedados no próprio TrueNAS pelo IP Tailscale — como SMB, interface web ou SSH — pode ser necessário editar o aplicativo, desmarcar **Userspace** e habilitar **Host Network**, criando a interface `tailscale0` no host. Essa alteração deve ser feita com cuidado e testada na versão instalada do TrueNAS.

## 4. Conferir o endereço do servidor

No painel **Machines**:

1. localizar o hostname configurado;
2. copiar o IP Tailscale, normalmente iniciado por `100.`;
3. se desejar, habilitar o MagicDNS para usar o hostname no lugar do IP.

Nunca coloque o IP verdadeiro do servidor em documentação pública quando ele não for necessário. Use marcadores como:

```text
IP_TAILSCALE_DO_TRUENAS
```

## 5. Configurar o computador Windows

1. baixar e instalar o Tailscale para Windows;
2. entrar com uma conta autorizada na mesma tailnet;
3. confirmar que o status está como conectado;
4. verificar se o TrueNAS aparece entre os dispositivos;
5. acessar o compartilhamento com **Windows + R**:

```text
\\IP_TAILSCALE_DO_TRUENAS\NOME_DO_COMPARTILHAMENTO
```

## 6. Validar o funcionamento

- confirmar que TrueNAS e Windows aparecem online;
- testar o acesso ao IP Tailscale;
- conferir se o SMB está ativo;
- autenticar com um usuário SMB válido;
- verificar as permissões do dataset;
- testar MagicDNS caso o acesso pelo hostname seja desejado.

## 7. Manutenção e segurança

- revogar a Auth Key depois do uso quando ela for descartável;
- não usar chave reutilizável sem necessidade;
- limitar o acesso por usuários, dispositivos ou tags;
- remover dispositivos antigos no painel Machines;
- revisar periodicamente as regras de acesso da tailnet;
- nunca publicar senhas, Auth Keys ou informações internas completas.

## Diagnóstico de DNS durante a instalação

Se o TrueNAS apresentar `lookup ghcr.io: no such host`, o aplicativo não conseguiu resolver o endereço do registro de contêiner. Nesse caso:

- verificar gateway e servidores DNS;
- testar a resolução de nomes no TrueNAS;
- conferir se o roteador responde às consultas;
- corrigir o DNS e tentar novamente.

## Referências

- [Tailscale — TrueNAS SCALE](https://tailscale.com/docs/integrations/truenas)
- [Tailscale — Auth Keys](https://tailscale.com/docs/features/access-control/auth-keys)
- [Tailscale — acesso remoto a NAS e compartilhamentos](https://tailscale.com/docs/use-cases/personal-or-at-home-use/access-nas-media-file-servers)
