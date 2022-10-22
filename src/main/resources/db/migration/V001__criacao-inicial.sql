create table tb_cozinha (
id bigint not null auto_increment,
nome varchar(255),
primary key (id)
) engine=InnoDB;

create table tb_estado (
id bigint not null auto_increment,
nome varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_cidade (
id bigint not null,
nome varchar(255),
estado_id bigint not null,
primary key (id)
) engine=InnoDB;

create table tb_forma_pagamento (
id bigint not null auto_increment,
descricao varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_grupo (
id bigint not null auto_increment,
nome varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_grupo_permissao (
grupo_id bigint not null,
permissao_id bigint not null
) engine=InnoDB;

create table tb_permissao (
id bigint not null auto_increment,
descricao varchar(255) not null,
nome varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_produto (
id bigint not null auto_increment,
ativo bit not null,
descricao varchar(255) not null,
nome varchar(255) not null,
preco decimal(19,2) not null,
restaurante_id bigint not null,
primary key (id)
) engine=InnoDB;

create table tb_restaurante (
id bigint not null auto_increment,
data_atualizacao datetime not null,
data_cadastro datetime not null,
endereco_bairro varchar(255),
endereco_cep varchar(255),
endereco_complemento varchar(255),
endereco_logradouro varchar(255),
endereco_numero varchar(255),
nome varchar(255) not null,
taxa_frete decimal(19,2) not null,
cozinha_id bigint not null,
endereco_cidade_id bigint,
primary key (id)
) engine=InnoDB;

create table tb_restaurante_forma_pagamento (
restaurante_id bigint not null,
forma_pagamento_id bigint not null
) engine=InnoDB;

create table tb_usuario (
id bigint not null auto_increment,
data_atualizacao datetime not null,
data_cadastro datetime not null,
email varchar(255) not null,
nome varchar(255) not null,
senha varchar(255) not null,
primary key (id)
) engine=InnoDB;

create table tb_usuario_grupo (
usuario_id bigint not null,
grupo_id bigint not null
) engine=InnoDB;

alter table tb_cidade add constraint fk_cidade_estado foreign key (estado_id) references tb_estado (id);

alter table tb_grupo_permissao add constraint fk_grupo_permissao_permissao foreign key (permissao_id) references tb_permissao (id);
alter table tb_grupo_permissao add constraint fk_grupo_permissao_grupo foreign key (grupo_id) references tb_grupo (id);
alter table tb_produto add constraint fk_produto_restaurante foreign key (restaurante_id) references tb_restaurante (id);
alter table tb_restaurante add constraint fk_restaurante_cozinha foreign key (cozinha_id) references tb_cozinha (id);
alter table tb_restaurante add constraint fk_restaurante_cidade foreign key (endereco_cidade_id) references tb_cidade (id);
alter table tb_restaurante_forma_pagamento add constraint fk_rest_forma_pagto_forma_pagto foreign key (forma_pagamento_id) references tb_forma_pagamento (id);
alter table tb_restaurante_forma_pagamento add constraint fk_rest_forma_pagto_restaurante foreign key (restaurante_id) references tb_restaurante (id);
alter table tb_usuario_grupo add constraint fk_usuario_grupo_grupo foreign key (grupo_id) references tb_grupo (id);
alter table tb_usuario_grupo add constraint fk_usuario_grupo_usuario foreign key (usuario_id) references tb_usuario (id);



