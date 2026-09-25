# Estudo de PXE Boot no TrueNAS

## Objetivo

Estudar a instalação do Windows pela rede, reduzindo a necessidade de pendrives em ambientes com vários computadores.

## Componentes necessários

- servidor DHCP com opções de inicialização;
- serviço TFTP;
- arquivos de boot compatíveis com UEFI ou Legacy;
- imagem de instalação do Windows;
- ambiente WinPE;
- compartilhamento de rede para os arquivos de instalação.

## Fluxo esperado

1. o computador solicita um endereço IP;
2. o DHCP informa o servidor e o arquivo de inicialização;
3. o equipamento baixa o boot pelo TFTP;
4. o WinPE é iniciado;
5. o instalador acessa a imagem do Windows pela rede.

## Situação

O recurso está documentado como estudo e futura implementação. Antes da implantação, é necessário validar a compatibilidade do DHCP da rede e separar corretamente os arquivos UEFI e Legacy.
