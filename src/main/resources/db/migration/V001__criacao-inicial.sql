create table tb_cozinha (
id varchar(36) not null,
nome varchar(255),
primary key (id)
) engine=InnoDB;

create table tb_estado (
id varchar(36) not null,
nome varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_cidade (
id varchar(36) not null,
nome varchar(255),
estado_id varchar(36) not null,
primary key (id)
) engine=InnoDB;

create table tb_forma_pagamento (
id varchar(36) not null,
descricao varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_grupo (
id varchar(36) not null,
nome varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_grupo_permissao (
grupo_id varchar(36) not null,
permissao_id varchar(36) not null
) engine=InnoDB;

create table tb_permissao (
id varchar(36) not null,
descricao varchar(255) not null,
nome varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_produto (
id varchar(36) not null,
ativo bit not null,
descricao varchar(255) not null,
nome varchar(255) not null,
preco decimal(19,2) not null,
restaurante_id varchar(36) not null,
primary key (id)
) engine=InnoDB;

create table tb_restaurante (
id varchar(36) not null,
data_atualizacao datetime not null,
data_cadastro datetime not null,
endereco_bairro varchar(255),
endereco_cep varchar(255),
endereco_complemento varchar(255),
endereco_logradouro varchar(255),
endereco_numero varchar(255),
nome varchar(255) not null,
taxa_frete decimal(19,2) not null,
cozinha_id varchar(36) not null,
endereco_cidade_id varchar(36),
primary key (id)
) engine=InnoDB;

create table tb_restaurante_forma_pagamento (
restaurante_id varchar(36) not null,
forma_pagamento_id varchar(36) not null
) engine=InnoDB;

create table tb_usuario (
id varchar(36) not null,
data_atualizacao datetime not null,
data_cadastro datetime not null,
email varchar(255) not null,
nome varchar(255) not null,
senha varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_usuario_grupo (
usuario_id varchar(36) not null,
grupo_id varchar(36) not null
) engine=InnoDB;







