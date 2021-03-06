create database bdmusicPower;
use bdmusicPower;

create table cliente (
	id int auto_increment,
    nome varchar(50),
    cpf varchar(18),
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

create table funcionario (
	id int auto_increment,
    nome varchar(50),
    cpf varchar(18),
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
    idcliente int,
    idfuncionario int,
    nomeCliente varchar(50),
    nomeFuncionario varchar(50),
    primary key(id),
    foreign key(idcliente) references cliente(id),
    foreign key(idfuncionario) references funcionario(id)
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
    mesReferente varchar(20),
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



create table produto (
	id int auto_increment,
    descricao varchar(50),
    marca varchar(50),
    modelo varchar(50),
    qtd int,
    valor double,
    lote varchar(50),
    primary key(id)
);

create table compra(
	id int auto_increment,
    fk_fornecedor int,
    fk_funcionario int,
    valor double,
    dataCompra date,
    foreign key(fk_fornecedor) references fornecedor(id),
    foreign key(fk_funcionario) references funcionario(id),
    primary key(id)
);

create table itensCompra (
	id int auto_increment,
	fk_compra int,
    fk_produto int,
    qtd int,
    valor double,
    foreign key(fk_compra) references compra(id),
    foreign key(fk_produto) references produto(id),
    primary key(id)
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
	id int auto_increment,
    fk_venda int,
    fk_produto int,
    qtd int,
    valor double,
    foreign key(fk_venda) references venda(id),
    foreign key(fk_produto) references produto(id),
    primary key(id)
);

create table administrador(
	id int auto_increment,
    nome varchar(50),
    cpf varchar(18),
    dataNascimento date,
    telefone varchar(12),
    email varchar(40),
    cidade varchar(20),
    uf varchar(5),
    rua varchar(30),
    bairro varchar(20),
    numResidencia varchar(5),
    cargo varchar(56),
    login varchar(15),
    senha varchar(20),
    primary key (id)
);
