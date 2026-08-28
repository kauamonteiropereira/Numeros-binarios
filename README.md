![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/licen%C3%A7a-MIT-blue?style=for-the-badge)
![Nível](https://img.shields.io/badge/n%C3%ADvel-iniciante-yellow?style=for-the-badge)
 
Programa em Java que percorre os números de **0 a 100** e mostra a representação de cada um em **binário**, usando o método pronto `Integer.toBinaryString()` da API do Java.
 
---
 
## 📋 Descrição
 
O programa usa um laço `for` para varrer os números de 0 até 100. Para cada número, converte o valor para binário e imprime o número decimal ao lado do seu correspondente binário.
 
## 💻 Código
 
```java
public class NumeroBinario {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 100; numero++) {
            String binario = Integer.toBinaryString(numero);
            System.out.println("Número " + numero + " - Binario " + binario);
        }
    }
}
```
 
## ▶️ Como executar
 
```bash
javac NumeroBinario.java
java NumeroBinario
```
 
## 📤 Exemplo de saída
 
```
Número 0 - Binario 0
Número 1 - Binario 1
Número 2 - Binario 10
Número 3 - Binario 11
Número 4 - Binario 100
...
Número 100 - Binario 1100100
```
 
## 🧠 Conceitos praticados
 
- Estrutura de repetição `for`
- Métodos prontos da API do Java (`Integer.toBinaryString`)
- Conversão entre bases numéricas (decimal → binário)
- Concatenação de strings com `System.out.println`
## 🚀 Possíveis melhorias
 
- Implementar a conversão decimal → binário manualmente (sem usar o método pronto), usando divisões sucessivas por 2.
- Permitir que o usuário escolha o intervalo de números via `Scanner`.
- Mostrar também a conversão para octal e hexadecimal (`Integer.toOctalString` e `Integer.toHexString`).
---
 
<p align="center">Feito com ☕ e Java</p>
