INSERT INTO tb_cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO tb_cozinha (id, nome) VALUES (2, 'Indiana');

INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id) VALUES (1, 'Thai Gourmet', 10, 1);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id) VALUES (2, 'Thai Delivery', 9.50, 1);
INSERT INTO tb_restaurante (id, nome, taxa_frete, cozinha_id) VALUES (3 ,'Tuk Tuk Comida Indiana', 15, 2);

INSERT INTO tb_estado (id, nome) VALUES (1, 'Minas Gerais');
INSERT INTO tb_estado (id, nome) VALUES (2, 'São Paulo');
INSERT INTO tb_estado (id, nome) VALUES (3, 'Ceará');

INSERT INTO tb_cidade (id, nome, estado_id) VALUES (1, 'Uberlândia', 1);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (2, 'Belo Horizonte', 1);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (3, 'São Paulo', 2);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (4, 'Campinas', 2);
INSERT INTO tb_cidade (id, nome, estado_id) VALUES (5, 'Fortaleza', 3);

INSERT INTO tb_forma_pagamento (id, descricao) VALUES (1, 'Cartão de crédito');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES (2, 'Cartão de débito');
INSERT INTO tb_forma_pagamento (id, descricao) VALUES (3, 'Dinheiro');

INSERT INTO tb_permissao (id, nome, descricao) VALUES (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
INSERT INTO tb_permissao (id, nome, descricao) VALUES (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');