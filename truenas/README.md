# Projeto de Servidor TrueNAS

## Visão geral

Este projeto documenta a implantação e a administração do meu servidor doméstico baseado em TrueNAS. O objetivo é centralizar arquivos, controlar o acesso de usuários, estudar serviços de rede e aplicar conhecimentos de infraestrutura na prática.

## Atividades realizadas

- instalação e configuração inicial do TrueNAS;
- gerenciamento de discos e armazenamento;
- criação de datasets e compartilhamentos SMB;
- configuração de usuários e permissões;
- acesso pelos sistemas Windows e macOS;
- acesso remoto seguro aos compartilhamentos usando Tailscale;
- instalação e diagnóstico de aplicativos;
- análise de integridade de discos com SMART;
- investigação de discos que não eram reconhecidos;
- estudo de PXE Boot para instalação do Windows pela rede;
- estudo de máquinas virtuais e serviços adicionais.

## Documentação

- [Acesso aos arquivos por SMB, inclusive pelo Tailscale](docs/acesso-smb.md)
- [Instalação e configuração do Tailscale](docs/tailscale-configuracao.md)
- [Usuários e permissões](docs/usuarios-e-permissoes.md)
- [Diagnóstico do Tailscale e DNS](docs/tailscale-dns.md)
- [Armazenamento e diagnóstico de discos](docs/armazenamento-e-discos.md)
- [Estudo de PXE Boot](docs/pxe-boot.md)

## Aprendizados

O projeto permitiu praticar administração de servidores, redes privadas, permissões, armazenamento, diagnóstico de hardware e leitura de logs. A documentação pública não contém senhas, Auth Keys, números de série completos ou outros dados sensíveis.
