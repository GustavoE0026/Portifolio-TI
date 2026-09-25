# Acesso aos arquivos por SMB

## Objetivo

Disponibilizar datasets do TrueNAS na rede local para computadores Windows e macOS.

## Etapas gerais

1. Criar o dataset destinado ao compartilhamento.
2. Criar os usuários e grupos necessários.
3. Definir proprietário e permissões do dataset.
4. Ativar o serviço SMB.
5. Criar um compartilhamento apontando para o dataset.
6. Testar o acesso com um usuário sem privilégios administrativos.

## Windows

No Explorador de Arquivos, o compartilhamento pode ser acessado com:

```text
\\IP_DO_TRUENAS\NOME_DO_COMPARTILHAMENTO
```

Também é possível usar **Este Computador → Mapear unidade de rede**.

## macOS

No Finder:

1. abrir **Ir → Conectar ao Servidor**;
2. informar `smb://IP_DO_TRUENAS/NOME_DO_COMPARTILHAMENTO`;
3. autenticar com o usuário criado no TrueNAS.

## Segurança

Cada pessoa deve usar sua própria conta. Contas administrativas não devem ser usadas para acessar arquivos no dia a dia.
