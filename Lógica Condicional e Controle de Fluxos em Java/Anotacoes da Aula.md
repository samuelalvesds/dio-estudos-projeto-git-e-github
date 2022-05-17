# Lógica Condicional e Controle de Fluxos em Java



### O que são Operadores Relacionais

são símbolos especiais os quais são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado.



**Tipos**

- Similaridade: Igual e diferente

- Tamanho: maior, maior igual, menor e menor igual.

  

---

### Utilizando Operadores Relacionais

- Similaridade 
  - Igualdade - Determina se um operando é igual ao outro (==)
  - Diferença - Determina se um operando não é igual ao outro (!=)

- Tamanho - *Strings e booleans não podem ser comparados por tamanho*

  - Maior (>)

  - Maior igual (>=)

  - Menor (<)

  - Menor igual (<=) 

    

---

### O que são Operadores Lógicos

São símbolos especiais quais são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado. 

**Tipos**

- Conjunção (&&)
  - só são verdadeiros se ambos operadores ou expressões envolvidas são verdade.
- Disjunção (||)
  - só é falsa se ambos operadores ou expressões envolvidas são falsos.
- Disjunção exclusiva (^)
  - só é verdade quando ambos os operandos ou expressões são opostos. (um verdadeiro e o outro falso ou vice-versa)
- Negação (!)
  - inverte o valor lógico de um operando ou expressão. 



**Como utilizar:**



**Bitwise e Shift**

- bitwise -> & e | (não são operadores lógicos)
- ~. >>, >>>, << (mexe com bits) [linguagens de baixo nível]



**Boas Práticas**

- Crie variáveis auxiliares para guardar resultados intermediários;

  

---

### Controle de Fluxo

**O que é **

São estruturas que tem a capacidade de direcionar o fluxo de execução do código



**Tipos**

- Decisão: if, if-else, if-else-if, switch e operador ternário;

- Repetição: for, while e do while;

- Interrupção: break, continue e return

  

*Avalia uma condição booleana ou variável para direcionar o fluxo de execução;*



- if 
- if-else
- if-else-if
- Operador ternário  
  - condição ? true : false; 
  - condição ? true : null; 
    - ligado ? desligar : ligar; 
    - emMovimento ? freia : null;
- switch -> usa valores e não operações booleanas;



**Boas Práticas**

- switch é para valores exatos e if para expressões booleanas;

- Evitar usar o default do switch para "casos genéricos";

- Evitar o efeito "flecha" dos if's;

- Evitar muitos if's aninhados;

- Usar a boa prática da aula 2 para diminuir o tamanho if;

  

---

### Blocos

**O que são**

é um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação;



**Tipos**

- Locais: dentro dos métodos
- Estáticos: dentro de classes
- Instância: dentro de classes



**Criação**

{ 

...

}

*quando há só 1 linha de código, não é obrigatório fechar chaves*



