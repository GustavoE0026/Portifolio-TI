# Diagnóstico do Tailscale e DNS

## Problema observado

A inicialização do aplicativo Tailscale falhou enquanto o TrueNAS tentava baixar uma imagem de contêiner.

Trecho sanitizado do erro:

```text
dial tcp: lookup ghcr.io: no such host
```

## Diagnóstico

A mensagem indica falha de resolução DNS: o servidor não conseguiu converter o domínio do registro de contêiner em um endereço IP.

## Verificações realizadas

- testar a conectividade com o gateway;
- testar a resolução de nomes;
- conferir os servidores DNS configurados;
- verificar o encaminhamento de consultas no roteador;
- testar temporariamente outro servidor DNS;
- conferir data e hora do sistema;
- repetir o download depois da correção.

## Aprendizado

Erros relacionados ao registro ou à obtenção de token podem ser consequência de uma falha anterior de DNS. A análise deve começar pela primeira causa apresentada no log.

> Dados internos da rede, endereços particulares e credenciais foram omitidos desta documentação pública.
