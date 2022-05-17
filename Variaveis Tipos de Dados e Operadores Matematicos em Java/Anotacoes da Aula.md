# Variáveis, Tipos de Dados e Operadores Matemáticos em Java



### Conceito e Criação

Um espaço na memória do computador, onde se pode guardar valores. 



**Existem 4 tipos:** 

- Instância: objeto
- Classe: classe
- Local: dentro de métodos
- Parâmetro: Na assinatura do método;



**Criação e Padrão de Definição**

<?visibilidade?><?modificador?> >tipo e nome (única obrigatória)< <?valorInicial?>;

- V: "public", "protected" e private;

- M: "static" e "final";
  - final - É uma variável constante (valor inalterado)

- T: tipo de dado;

- N: nome que é fornecido a variável;

- VI: um valor inicial, caso precise/desejado;



**Convenções e Regras**

- Não devem começar com números; 
- ""$" e "_" devem ser evitados no início;
- São case-sensitive;
- Sem espaços; 
- Não pode ser palavras reservadas do Java 



**Boas práticas**

- Sempre começar com a letra minúscula;

- Nomes expressivos; 

- Camel Case; (tipoVariável)

- Quando constante (final) maiúscula e separada por "_"; _NUMERO_TENTATIVAS = 5_

  

---

### Tipos de Dados

**Conceituação: Dados**

São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.



**Tipificação**

- Estática (forte) vs Dinâmica (fraco);
  - A linguagem obriga a definir o tipo de variável já no momento de criação (Estática)
  - Você não é obrigado a definir o tipo no momento da criação, mas o compilador presume e define no momento da compilação.
- Primitivo vs Composto
  - Básicos, são atômicos e homogêneos. (valores numéricos textuais etc.)
  - Muito ligado à orientação a objeto. Ele é composto de várias tipos de dados.

**Tipos**

- textual

  - char
  - String (um tipo 'especial'. É UM OBJETO)

- numeral

  - byte -128 até 127
  - short -32.768
  - int
  - long
  - float
  - double

- logico

  - true

  - false

    (boolean)

- objeto



### Operadores Aritméticos

São símbolos especiais quais são capazes de realizar ações específicas em um, dois ou mais operandos e, em seguida, retornar um resultado.



**Tipos**

- pós fixado: i++ ou i--
- prefixado: ++i ou --i
- aritmética: +, -, *, / e %
- Atribuição: =, +=, -=, /= e %=



### Conversões (Casting)

É a transformação de uma determinada variável de tipos menos específico para um tipo mais específico ou vice-verse;

**Tipos**

- Upcast (menor capacidade para maior capacidade) - implícito
- Downcast - explícito

![image-20220511155904273](https://i.ibb.co/w7n6jXN/image-20220511155904273.png)



