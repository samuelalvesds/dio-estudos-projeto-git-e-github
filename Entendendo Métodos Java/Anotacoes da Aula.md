# Entendendo Métodos Java



### Conceituação de Métodos

É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma _requisição_ a ele. São responsáveis por definir e realizar um determinado comportamento.



---

### Definição

**Criação**

**Padrões de definição**

<?visibilidade?><?tipo?><?modificador?>>retorno e nome< <?parâmetros?><?exceções?>>corpo<



**Onde:** (Siglas dos Padrões de Definição)

- <u>V</u> : "Public", "protected" ou "private"; ()

- T: concreto ou abstrato

- M: "static" ou "final"

- <u>R</u>: tipo de dado ou "void"

- <u>N</u>: nome que é fornecido ao método; (mesmas regras das declarações de variáveis)

- <u>P</u>: parâmetros que pode receber; 

- E: exceções que pode lançar

- <u>C</u>: código que possui ou vazio

  

![image-20220512134855287](https://i.ibb.co/jDPVykR/image-20220512134855287.png)

****



**Utilização**

Passa-se uma mensagem através de uma classe ou objeto.



nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);

nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);



​	**ex classe: **

​	Math.random(); ou Math.sqrt(4);



---

### **Conceitos Inerentes aos métodos**

**Particularidades**

- Assinatura: é a forma de identificar unicamente o método

  - Ass = nome + parâmetros; 

    - Método: *public double calcularTotalVenda(double precoItem1, double precoItem2, precoItem3)*

    - Assinatura: calcularTotalVenda (doubleItem1, doubleItem2, doubleItem3)

      

- Construtor e Destrutor: são métodos especiais usados na Orientação a Objetos. 

  

- Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe. 

  

- Passagem de Parâmetros:

  - Por valor (cópia);
  - Por referência (endereço);

![image-20220512140032018](https://i.ibb.co/31xm5mj/image-20220512140032018.png)

​	O valor de "i" fora do método é 10 e dentro do método ele é 20.



**Boas Práticas**

- Nomes devem ser descritivos, mas curtos; (pode se usar verbos)

- Camel Case

- Deve possuir entre 80 e 120 linhas;

- Evite Lista de parâmetros longas

- Visibilidade adequadas; (public, protected ou private)

  

---

### Sobrecargas

é a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.



**Criação**

Alterar a assinatura do método.
Assinatura= nome + parâmetros.

![image-20220512163346616](https://i.ibb.co/gv8zDpq/image-20220512163346616.png)



**Sobrecarga vs Sobrescrita**

- Sobrescrita está ligada à herança.
- 

---

### Return (retornos)

É um instrumento de interrupção;



**Funcionamento**

O método executa seu retorno quando:

- Completa suas instruções internas;
- Chega a uma declaração explícita de retorno;
- Lança uma exceção;



**Considerações**

- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto; 
- O tipo de dado do return deve ser compatível com o do método; 
- Se o método for sem retorno (void), pode ou não ter um "return" para encerrar sua execução; -- Ele só funciona se não retornar valor, apenas se for "return;"

