# Usuários e permissões no TrueNAS

## Objetivo

Permitir que cada usuário veja e acesse somente sua própria pasta, mesmo quando existirem outros datasets no servidor.

## Organização recomendada

```text
/mnt/pool/usuarios/
├── usuario1/
├── usuario2/
└── usuario3/
```

## Configuração

1. Criar uma conta para cada pessoa.
2. Criar um dataset ou diretório individual.
3. Definir o usuário como proprietário de sua pasta.
4. Remover permissões concedidas a grupos genéricos quando não forem necessárias.
5. Criar um compartilhamento SMB individual ou usar recursos de diretório pessoal.
6. Testar com uma conta comum antes de disponibilizar o acesso.

## Princípio aplicado

Foi utilizado o princípio do menor privilégio: cada conta recebe apenas as permissões necessárias para executar sua função.
