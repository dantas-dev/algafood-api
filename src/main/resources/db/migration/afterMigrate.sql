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

INSERT INTO tb_cozinha (id, nome) VALUES ('6fffba86-eab7-4dce-9cbd-7422ab24a7b7', 'Tailandesa');
INSERT INTO tb_cozinha (id, nome) VALUES ('190e989f-9454-4cb7-b24a-982ba900d16d', 'Indiana');
INSERT INTO tb_cozinha (id, nome) VALUES ('29047591-ae83-4e5c-a53c-ba278bd64acf', 'Argentina');
INSERT INTO tb_cozinha (id, nome) VALUES ('1387a7fc-086c-4a62-b139-f5580827203f', 'Brasileira');

INSERT INTO tb_estado (id, nome) VALUES ('3f5035f0-1211-4c82-93a1-df0703e5956a', 'Minas Gerais');
INSERT INTO tb_estado (id, nome) VALUES ('b8466712-562b-40e9-b3b3-53b5355c0c96', 'São Paulo');
INSERT INTO tb_estado (id, nome) VALUES ('d08a9bee-a5a0-4688-bc75-102a1f1b833f', 'Ceará');

INSERT INTO tb_cidade (id, nome, estado_id) VALUES ('0e916066-176e-4fbe-bcca-a993441f0d7c', 'Uberlândia', '3f5035f0-1211-4c82-93a1-df0703e5956a');
INSERT INTO tb_cidade (id, nome, estado_id) VALUES ('2cb71842-7488-4f29-909e-049ea32a69c8', 'Belo Horizonte', '3f5035f0-1211-4c82-93a1-df0703e5956a');
INSERT INTO tb_cidade (id, nome, estado_id) VALUES ('090dd2a1-59b5-4675-9a23-203d7b6285d5', 'São Paulo', 'b8466712-562b-40e9-b3b3-53b5355c0c96');
INSERT INTO tb_cidade (id, nome, estado_id) VALUES ('1df92c53-5ca3-43b3-89de-a340a83e02a7', 'Campinas', 'b8466712-562b-40e9-b3b3-53b5355c0c96');
INSERT INTO tb_cidade (id, nome, estado_id) VALUES ('bdd86d8b-4e70-4a2c-8d36-36e1cd2aaa0f', 'Fortaleza', 'd08a9bee-a5a0-4688-bc75-102a1f1b833f');

INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_complemento, endereco_bairro, endereco_cidade_id, data_cadastro, data_atualizacao) VALUES ('3bde951b-ac06-4a84-b37e-bda313215357', 'Thai Gourmet', 10, '6fffba86-eab7-4dce-9cbd-7422ab24a7b7', '38400-999', 'Rua João Pinheiro', '1000', null, 'Centro',  1, utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES ('618ed7c3-6990-48f4-8aae-ad4187ce84d4', 'Thai Delivery', 9.50, '6fffba86-eab7-4dce-9cbd-7422ab24a7b7', utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES ('d06b21e6-05e2-414c-bc81-7730abfe035b' ,'Tuk Tuk Comida Indiana', 15, '190e989f-9454-4cb7-b24a-982ba900d16d', utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES ('d3660afe-1e2c-4bc3-823e-b8b8ef8aa8a6', 'Java Steakhouse', 12, '29047591-ae83-4e5c-a53c-ba278bd64acf', utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES ('31c46a08-c87d-4703-9207-3e8701e02f09', 'Lanchonete do Tio Sam', 11, '1387a7fc-086c-4a62-b139-f5580827203f', utc_timestamp, utc_timestamp);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) VALUES ('930f702a-f6e0-4288-ab9f-3ad7c2b1b69c', 'Bar da Maria', 6, '1387a7fc-086c-4a62-b139-f5580827203f', utc_timestamp, utc_timestamp);

INSERT INTO tb_forma_pagamento (id, descricao) VALUES ('75d6eff8-b974-4368-9da7-aca85f6e02a3', 'Cartão de crédito');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES ('9871b40f-cf00-432d-bd6f-db32c0fbb6c5', 'Cartão de débito');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES ('484fb484-7e6c-4721-803b-f66149022611', 'Dinheiro');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES ('3219aeb7-d5ba-4096-aa40-a2a25c1faa9f', 'Pix');

INSERT INTO tb_permissao (id, nome, descricao) VALUES ('557da8ed-a17c-43b2-8353-aceff8d3fbd8', 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
INSERT INTO tb_permissao (id, nome, descricao) VALUES ('dff970c7-0bc9-4d27-a2d0-df44507ce7dc', 'EDITAR_COZINHAS', 'Permite editar cozinhas');

INSERT INTO tb_restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) VALUES ('3bde951b-ac06-4a84-b37e-bda313215357', '75d6eff8-b974-4368-9da7-aca85f6e02a3'), ('3bde951b-ac06-4a84-b37e-bda313215357', '9871b40f-cf00-432d-bd6f-db32c0fbb6c5'), ('3bde951b-ac06-4a84-b37e-bda313215357', '484fb484-7e6c-4721-803b-f66149022611'), ('3bde951b-ac06-4a84-b37e-bda313215357', '3219aeb7-d5ba-4096-aa40-a2a25c1faa9f'), ('618ed7c3-6990-48f4-8aae-ad4187ce84d4', '75d6eff8-b974-4368-9da7-aca85f6e02a3'), ('618ed7c3-6990-48f4-8aae-ad4187ce84d4', '9871b40f-cf00-432d-bd6f-db32c0fbb6c5'), ('618ed7c3-6990-48f4-8aae-ad4187ce84d4', '484fb484-7e6c-4721-803b-f66149022611'), ('618ed7c3-6990-48f4-8aae-ad4187ce84d4', '3219aeb7-d5ba-4096-aa40-a2a25c1faa9f'), ('d06b21e6-05e2-414c-bc81-7730abfe035b', '75d6eff8-b974-4368-9da7-aca85f6e02a3'), ('d06b21e6-05e2-414c-bc81-7730abfe035b', '9871b40f-cf00-432d-bd6f-db32c0fbb6c5'), ('d06b21e6-05e2-414c-bc81-7730abfe035b', '484fb484-7e6c-4721-803b-f66149022611'), ('d06b21e6-05e2-414c-bc81-7730abfe035b', '3219aeb7-d5ba-4096-aa40-a2a25c1faa9f'), ('d3660afe-1e2c-4bc3-823e-b8b8ef8aa8a6', '75d6eff8-b974-4368-9da7-aca85f6e02a3'), ('d3660afe-1e2c-4bc3-823e-b8b8ef8aa8a6', '9871b40f-cf00-432d-bd6f-db32c0fbb6c5'), ('31c46a08-c87d-4703-9207-3e8701e02f09', '75d6eff8-b974-4368-9da7-aca85f6e02a3'), ('31c46a08-c87d-4703-9207-3e8701e02f09', '9871b40f-cf00-432d-bd6f-db32c0fbb6c5'), ('930f702a-f6e0-4288-ab9f-3ad7c2b1b69c', '484fb484-7e6c-4721-803b-f66149022611');

INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('fe740f8f-13e6-4226-a7ca-ddee1c99552e', 'Porco com molho agridoce', 'Deliciosa carne suína ao molho especial', 78.90, 1, '3bde951b-ac06-4a84-b37e-bda313215357');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('b6ff71cd-0697-4e7f-a117-d66e94eff21f', 'Camarão tailandês', '16 camarões grandes ao molho picante', 110, 1, '3bde951b-ac06-4a84-b37e-bda313215357');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('2bf77d7c-d319-4102-8414-33e1756bbb0c', 'Salada picante com carne grelhada', 'Salada de folhas com cortes finos de carne bovina grelhada e nosso molho especial de pimenta vermelha', 87.20, 1, '618ed7c3-6990-48f4-8aae-ad4187ce84d4');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('1534d6ba-4c7d-4db5-9b93-cd46a25586f9', 'Garlic Naan', 'Pão tradicional indiano com cobertura de alho', 21, 1, 'd06b21e6-05e2-414c-bc81-7730abfe035b');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('f889bd7a-eb2d-44b0-9d56-e8bde0c93007', 'Murg Curry', 'Cubos de frango preparados com molho curry e especiarias', 43, 1, 'd06b21e6-05e2-414c-bc81-7730abfe035b');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('26f5a74b-7911-4c1e-b2fb-7cb376088f92', 'Bife Ancho', 'Corte macio e suculento, com dois dedos de espessura, retirado da parte dianteira do contrafilé', 79, 1, 'd3660afe-1e2c-4bc3-823e-b8b8ef8aa8a6');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('c24324c7-1493-419f-9255-ebdd566215c8', 'T-Bone', 'Corte muito saboroso, com um osso em formato de T, sendo de um lado o contrafilé e do outro o filé mignon', 89, 1, 'd3660afe-1e2c-4bc3-823e-b8b8ef8aa8a6');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('8a433785-3dd9-4f5b-b459-83a18c1363ba', 'Sanduíche X-Tudo', 'Sandubão com muito queijo, hamburger bovino, bacon, ovo, salada e maionese', 19, 1, '31c46a08-c87d-4703-9207-3e8701e02f09');
INSERT INTO tb_produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES ('9e9d25c9-fb63-489a-9d93-547174e40d0c', 'Espetinho de Cupim', 'Acompanha farinha, mandioca e vinagrete', 8, 1, '930f702a-f6e0-4288-ab9f-3ad7c2b1b69c');