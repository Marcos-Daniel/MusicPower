create database bdmusicPower;
use bdmusicPower;

create table cliente (
	id int auto_increment,
    nome varchar(50),
    cpf varchar(12),
    dataNascimento date,
    telefone varchar(12),
    email varchar(40),
    cidade varchar(20),
    uf varchar(3),
    rua varchar(30),
    bairro varchar(20),
    numResidencia varchar(5),
    primary key(id)
); 
create table filial (
	id int auto_increment,
    uf varchar(3),
    cidade varchar(20),
    bairro varchar(20),
    rua varchar(30),
    numEstabelicimento varchar(5),
    primary key(id)
);

create table servico (
	id int auto_increment,
    descricao varchar(30),
    dataSolicitacao date,
    dataEntrega date,
    valor double,
    statusPagamento varchar(30),
    statusProgresso varchar(30),
    primary key(id)
);

create table evento (
	id int auto_increment,
    nome varchar(30),
    descricao varchar(200),
    inicio datetime,
    fim datetime,
    valor double,
    statusEvento varchar(30),
    primary key(id)
);

create table conta (
	id int auto_increment,
    descricao varchar(30),
    valor double,
    mesReferente varchar(3),
    vencimento date,
    statusConta varchar(30),
    primary key(id)
);

create table fornecedor (
	id int auto_increment,
    nome varchar(30),
    cnpj varchar(20),
    telefone varchar(12),
    email varchar(40),
    uf varchar(3),
    cidade varchar(20),
    bairro varchar(20),
    rua varchar(30),
    numEstabelecimento varchar(5),
    primary key(id)
);

create table funcionario (
	id int auto_increment,
    nome varchar(50),
    cpf varchar(12),
    dataNascimento date,
    telefone varchar(12),
    email varchar(40),
    cidade varchar(20),
    uf varchar(3),
    rua varchar(30),
    bairro varchar(20),
    numResidencia varchar(5),
    cargo varchar(30),
    primary key(id)
);

create table produto (
	id int auto_increment,
    descricao varchar(20),
    qtd int,
    valor double,
    primary key(id)
);

create table compra(
	id int auto_increment,
    fk_fornecedor int,
    valor double,
    dataCompra date,
    foreign key(fk_fornecedor) references fornecedor(id),
    primary key(id)
);

create table itensCompra (
	fk_compra int,
    fk_produto int,
    qtd int,
    valor double,
    foreign key(fk_compra) references compra(id),
    foreign key(fk_produto) references produto(id)
);

create table venda (
	id int auto_increment,
    fk_cliente int,
    fk_funcionario int,
    valor double,
    datavenda date,
    foreign key(fk_cliente) references cliente(id),
    foreign key(fk_funcionario) references funcionario(id),
    primary key(id)
);

create table itensVenda (
	fk_venda int,
    fk_produto int,
    qtd int,
    valor double,
    foreign key(fk_venda) references venda(id),
    foreign key(fk_produto) references produto(id)
);
