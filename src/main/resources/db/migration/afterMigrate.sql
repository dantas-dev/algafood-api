SET foreign_key_checks = 0;

DELETE FROM tb_cidade;
DELETE FROM tb_cozinha;
DELETE FROM tb_estado;
DELETE FROM tb_forma_pagamento;
DELETE FROM tb_grupo;
DELETE FROM tb_grupo_permissao;
DELETE FROM tb_permissao;
DELETE FROM tb_produto;
DELETE FROM tb_restaurante;
DELETE FROM tb_restaurante_forma_pagamento;
DELETE FROM tb_usuario;
DELETE FROM tb_usuario_grupo;

SET foreign_key_checks = 1;

ALTER TABLE tb_cidade auto_increment = 1;
ALTER TABLE tb_cozinha auto_increment = 1;
ALTER TABLE tb_estado auto_increment = 1;
ALTER TABLE tb_forma_pagamento auto_increment = 1;
ALTER TABLE tb_grupo auto_increment = 1;
ALTER TABLE tb_permissao auto_increment = 1;
ALTER TABLE tb_produto auto_increment = 1;
ALTER TABLE tb_restaurante auto_increment = 1;
ALTER TABLE tb_usuario auto_increment = 1;

INSERT INTO tb_cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO tb_cozinha (id, nome) VALUES (2, 'Indiana');
INSERT INTO tb_cozinha (id, nome) VALUES (3, 'Argentina');
INSERT INTO tb_cozinha (id, nome) VALUES (4, 'Brasileira');

INSERT INTO tb_estado (id, nome) VALUES (1, 'Minas Gerais');
INSERT INTO tb_estado (id, nome) VALUES (2, 'São Paulo');
INSERT INTO tb_estado (id, nome) VALUES (3, 'Ceará');

INSERT INTO tb_cidade (id, nome, estado_id) VALUES (1, 'Uberlândia', 1);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (2, 'Belo Horizonte', 1);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (3, 'São Paulo', 2);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (4, 'Campinas', 2);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (5, 'Fortaleza', 3);

INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_complemento, endereco_bairro, endereco_cidade_id, data_cadastro, data_atualizacao) VALUES (1, 'Thai Gourmet', 10, 1, '38400-999', 'Rua João Pinheiro', '1000', null, 'Centro',  1, utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES (2, 'Thai Delivery', 9.50, 1, utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES (3 ,'Tuk Tuk Comida Indiana', 15, 2, utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES (4, 'Java Steakhouse', 12, 3, utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES (5, 'Lanchonete do Tio Sam', 11, 4, utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES (6, 'Bar da Maria', 6, 4, utc_timestamp, utc_timestamp);

INSERT INTO tb_forma_pagamento (id, descricao) VALUES (1, 'Cartão de crédito');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES (2, 'Cartão de débito');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES (3, 'Dinheiro');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES (4, 'Pix');

INSERT INTO tb_permissao (id, nome, descricao) VALUES (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
INSERT INTO tb_permissao (id, nome, descricao) VALUES (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');

INSERT INTO tb_restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) VALUES (1, 1), (1, 2), (1, 3), (1, 4), (2, 1), (2, 2), (2, 3), (2, 4), (3, 1), (3, 2), (3, 3), (3, 4), (4, 1), (4, 2), (5, 1), (5, 2), (6, 3);

INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Porco com molho agridoce', 'Deliciosa carne suína ao molho especial', 78.90, 1, 1);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Camarão tailandês', '16 camarões grandes ao molho picante', 110, 1, 1);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Salada picante com carne grelhada', 'Salada de folhas com cortes finos de carne bovina grelhada e nosso molho especial de pimenta vermelha', 87.20, 1, 2);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Garlic Naan', 'Pão tradicional indiano com cobertura de alho', 21, 1, 3);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Murg Curry', 'Cubos de frango preparados com molho curry e especiarias', 43, 1, 3);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Bife Ancho', 'Corte macio e suculento, com dois dedos de espessura, retirado da parte dianteira do contrafilé', 79, 1, 4);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('T-Bone', 'Corte muito saboroso, com um osso em formato de T, sendo de um lado o contrafilé e do outro o filé mignon', 89, 1, 4);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Sanduíche X-Tudo', 'Sandubão com muito queijo, hamburger bovino, bacon, ovo, salada e maionese', 19, 1, 5);
INSERT INTO tb_produto (nome, descricao, preco, ativo, restaurante_id) VALUES ('Espetinho de Cupim', 'Acompanha farinha, mandioca e vinagrete', 8, 1, 6);