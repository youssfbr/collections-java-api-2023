Operações Básicas com List

1. Lista de tarefas

Crie uma classe chamada "ListaTarefas" que possui
uma lista de tarefas como atributo. Cada tarefa é
representada por uma classe chamada "Tarefa" que 
possui um atributo de descrição. Implemente os
seguintes métodos:

* adicionarTarefa(String descricao) : Adiciona uma
nova tarefa à lista com a descrição fornecida.
* removerTarefa(String descricao) : Remove uma 
tarefa da lista com base em sua descrição.
* obterNumeroTotalTarefas() : Retorna o número total
de tarefas na lista.
* obterDescriçõesTarefas() : Retorna uma lista contendo
a descrição de todas as rtarefas na lista.

2. Carrinho de Compras
Crie uma classe chamada "CarrinhoDeCompras" que representa
um carrinho de compras online. O carrinho deve ser implementado
como uma lista de itens.
Cada item é representado por uma classe chamada "Item" que 
possui atributos como nome, preco e quantidade. Implemente os seguintes métodos:

* adicionarItem(String nome, double preco, int quantidade) : Adiciona 
um item ao carrinho com o nome, preco e quantidade especificados.
* removerItem(String) : Remove um item do carrinho com base no seu nome.
* calcularValorTotal() : Calcula e retorna o valor total do carrinho, levando em
consideração o preço e a quantidade de cada item.
* exibirItens() : Exive todos os itens presentes no carrinho, mostrando seus nomes, 
preços e quantidades