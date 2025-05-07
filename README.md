# 💱 Conversor de Moedas com API

Bem-vindo ao **Conversor de Moedas**! Este é um projeto em Java que permite converter valores entre diferentes moedas, utilizando dados atualizados em tempo real da API [ExchangeRate-API](https://www.exchangerate-api.com/). 🚀

## 🧠 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de praticar os conceitos de:

- **Orientação a Objetos**
- **Consumo de API com `HttpClient`**
- **Serialização e Desserialização com Gson**
- **Tratamento de erros**
- **Interação via terminal**

---

## 🔧 Como funciona

O programa apresenta um menu interativo no terminal, onde você pode escolher entre diferentes opções de conversão de moedas, como:

1. Dólar para Real brasileiro 🇺🇸➡🇧🇷  
2. Euro para Dólar 💶➡💵  
3. Real brasileiro para Yuan 🇧🇷➡🇨🇳  
4. Real brasileiro para Wones 🇧🇷➡🇰🇷  
5. Real brasileiro para Ienes 🇧🇷➡🇯🇵  
6. Ienes para Yuan 🇯🇵➡🇨🇳  
7. Sair 🚪

Você informa o valor a ser convertido e o sistema retorna o valor atualizado com base na taxa de câmbio atual da API.

---

## 🛠️ Tecnologias utilizadas

- Java 17+ ☕
- Gson (para manipulação de JSON)
- API pública da [ExchangeRate-API](https://www.exchangerate-api.com/)
- Terminal para entrada e saída de dados

---

## ▶️ Como executar o projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   cd conversor-moedas
Compile os arquivos:
javac -d out src/**/*.java
Execute a aplicação:
java -cp out view.Interface

⚠️ Certifique-se de ter o Java instalado e configurado na sua máquina (java -version).

💡 Exemplo de uso

-----------------------------------------------------
  $   Seja bem-vindo(a) ao Conversor de Moedas   $
-----------------------------------------------------

1) Dólar => Real brasileiro
2) Euro => Dólar
...
Escolha uma opção válida:
1
Digite o valor em dollar para converter em real:
100
O valor de 100.00 [USD] convertido para [BRL] é: 517.45

📦 Organização das classes

model/ApiClient: responsável por se comunicar com a API
model/ApiResponse e Moedas: modelos para mapear os dados JSON
view/InteracaoComUsuario: lógica de conversão e mensagens
view/Interface: interface principal de interação via terminal

❗ Observação

Este projeto usa uma chave de API gratuita com limite de requisições. Para evitar falhas, é recomendado criar sua própria chave em exchangerate-api.com e substituí-la na ApiClient.

// Linha que pode ser alterada com sua própria chave
this.endereco = "https://v6.exchangerate-api.com/v6/SUA_CHAVE_AQUI/latest/USD";

🧑‍💻 Autor

Desenvolvido por Jhonata David como parte de seus estudos com Java e APIs.

📚 Programa ONE da Oracle & Alura
🔗 LinkedIn (www.linkedin.com/in/jhonatadavid-backend)

📜 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

⭐ Gostou do projeto?
Deixe uma ⭐ no repositório e contribua com sugestões ou melhorias! 🙌

