# Acesso aos arquivos por SMB

## Objetivo

Disponibilizar os compartilhamentos SMB do TrueNAS tanto na rede local quanto remotamente por meio do Tailscale, sem publicar a porta SMB diretamente na internet.

## Preparação do compartilhamento

1. Criar o dataset destinado aos arquivos.
2. Criar os usuários e grupos necessários.
3. Definir o proprietário e as permissões do dataset.
4. Ativar o serviço SMB.
5. Criar um compartilhamento apontando para o dataset.
6. Testar o acesso com um usuário sem privilégios administrativos.

## Acesso pelo Windows na rede local

No Explorador de Arquivos ou na janela **Executar**, usar:

```text
\\IP_LOCAL_DO_TRUENAS\NOME_DO_COMPARTILHAMENTO
```

## Acesso remoto pelo Windows usando Tailscale

Antes de acessar:

1. instalar o Tailscale no computador Windows;
2. entrar na mesma conta ou tailnet utilizada pelo TrueNAS;
3. confirmar no Tailscale que o computador e o servidor estão conectados;
4. localizar o IP Tailscale do TrueNAS na página **Machines**. Normalmente ele começa com `100.`;
5. confirmar que o aplicativo Tailscale no TrueNAS está configurado para permitir acesso aos serviços do host.

Para abrir o compartilhamento:

1. pressionar **Windows + R**;
2. na caixa **Executar**, informar o IP Tailscale do TrueNAS com duas barras invertidas:

```text
\\IP_TAILSCALE_DO_TRUENAS
```

Exemplo fictício:

```text
\\100.100.10.20
```

3. pressionar **Enter**;
4. informar o usuário e a senha do compartilhamento SMB;
5. abrir a pasta desejada.

Também é possível abrir diretamente um compartilhamento:

```text
\\IP_TAILSCALE_DO_TRUENAS\NOME_DO_COMPARTILHAMENTO
```

Se o MagicDNS estiver habilitado, o nome do servidor pode substituir o IP:

```text
\\NOME_DO_TRUENAS\NOME_DO_COMPARTILHAMENTO
```

## Mapear como unidade de rede

1. abrir **Este Computador**;
2. selecionar **Mapear unidade de rede**;
3. escolher uma letra;
4. informar `\\IP_TAILSCALE_DO_TRUENAS\NOME_DO_COMPARTILHAMENTO`;
5. marcar **Reconectar na entrada**, se necessário;
6. autenticar com o usuário do SMB.

## Acesso pelo macOS

No Finder:

1. abrir **Ir → Conectar ao Servidor**;
2. informar:

```text
smb://IP_TAILSCALE_DO_TRUENAS/NOME_DO_COMPARTILHAMENTO
```

3. autenticar com o usuário criado no TrueNAS.

## Solução de problemas

- confirmar que o Tailscale está conectado nos dois dispositivos;
- testar o IP Tailscale do servidor;
- confirmar que o serviço SMB está em execução;
- verificar as permissões do dataset;
- testar primeiro pelo IP e depois pelo nome MagicDNS;
- verificar as regras de acesso da tailnet;
- não expor diretamente a porta TCP 445 no roteador.

## Segurança

Cada pessoa deve utilizar sua própria conta SMB. Contas administrativas não devem ser usadas no acesso diário. O endereço mostrado neste documento é apenas um exemplo fictício.
