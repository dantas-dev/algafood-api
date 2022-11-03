create table tb_pedido (
    id varchar(36) not null,
    restaurante_id varchar(36) not null,
    usuario_cliente_id varchar(36) not null,
    subtotal decimal(10,2) not null,
    taxa_frete decimal(10,2) not null,
    valor_total decimal(10,2) not null,
    endereco_cidade_id varchar(36) not null,
    endereco_cep varchar(9) not null,
    endereco_logradouro varchar(100) not null,
    endereco_numero varchar(20) not null,
    endereco_complemento varchar(60) null,
    endereco_bairro varchar(60) not null,
    forma_pagamento_id varchar(36) not null,
    status varchar(10) not null,
    data_criacao datetime not null,
    data_confirmacao datetime null,
    data_cancelamento datetime null,
    data_entrega datetime null,

    primary key (id),

    constraint fk_pedido_endereco_cidade foreign key (endereco_cidade_id) references tb_cidade (id),
    constraint fk_pedido_restaurante foreign key (restaurante_id) references tb_restaurante (id),
    constraint fk_pedido_usuario_cliente foreign key (usuario_cliente_id) references tb_usuario (id),
    constraint fk_pedido_forma_pagamento foreign key (forma_pagamento_id) references tb_forma_pagamento (id)
) engine=InnoDB;

create table tb_item_pedido (
    id varchar(36) not null,
    quantidade smallint(6) not null,
    preco_unitario decimal(10,2) not null,
    preco_total decimal(10,2) not null,
    observacao varchar(255) null,
    pedido_id varchar(36) not null,
    produto_id varchar(36) not null,

    primary key (id),
    unique key uk_item_pedido_produto (pedido_id, produto_id),

    constraint fk_item_pedido_pedido foreign key (pedido_id) references tb_pedido (id),
    constraint fk_item_pedido_produto foreign key (produto_id) references tb_produto (id)
) engine=InnoDB;