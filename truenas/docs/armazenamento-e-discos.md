# Armazenamento e diagnóstico de discos

## Atividades

- identificação de discos disponíveis;
- tentativa de inclusão de novos discos no armazenamento;
- troca de cabos e portas durante o diagnóstico;
- leitura de dados SMART;
- análise de capacidade, modelo, firmware e setores;
- estudo sobre discos SMR e seu comportamento em servidores.

## Quando um disco não aparece

1. verificar alimentação e cabo de dados;
2. testar outra porta SATA ou controladora;
3. confirmar se o disco aparece na BIOS/UEFI;
4. verificar a lista de dispositivos no TrueNAS;
5. consultar logs do sistema;
6. executar testes SMART quando o dispositivo estiver disponível;
7. evitar adicionar um disco ao pool antes de avaliar sua saúde.

## Cuidados

Alterações em pools podem causar perda de dados. Antes de qualquer mudança estrutural, é necessário manter backup atualizado e confirmar exatamente quais discos serão utilizados.
