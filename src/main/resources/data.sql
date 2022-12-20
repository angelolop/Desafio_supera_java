CREATE TABLE conta
(
    id_conta IDENTITY NOT NULL PRIMARY KEY,
    nome_responsavel VARCHAR(50) NOT NULL
);


CREATE TABLE transferencia
(
    id IDENTITY NOT NULL PRIMARY KEY,
    data_transferencia TIMESTAMP WITH TIME ZONE NOT NULL,
    valor NUMERIC (20,2) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    nome_operador_transacao VARCHAR (50),
    conta_id INT NOT NULL,

        CONSTRAINT FK_CONTA
        FOREIGN KEY (conta_id)
        REFERENCES conta(id_conta)
);

INSERT INTO conta (id_conta, nome_responsavel) VALUES (1,'Fulano');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (2,'Sicrano');

INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (1,'2019-01-01 12:00:00+03',30895.46,'DEPOSITO', null, 1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (2,'2019-02-03 09:53:27+03',12.24,'DEPOSITO', null,2);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (3,'2019-05-04 08:12:45+03',-500.50,'SAQUE', null,1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (4,'2019-08-07 08:12:45+03',-530.50,'SAQUE', null,2);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (5,'2020-06-08 10:15:01+03',3241.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (6,'2021-04-01 12:12:04+03',25173.09,'TRANSFERENCIA', 'Ronnyscley',2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (7, '2019-03-09', 832.51, 'SAQUE', 'Beltrano', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (8, '2021-07-02', 667.48, 'DEPOSITO', 'Beltrano', 1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (9, '2021-09-06', 744.8, 'TRANSFERENCIA', 'Beltrano', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (10, '2019-06-07', 392.12, 'SAQUE', 'Ronnyscley', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (11, '2021-12-04', 264.6, 'DEPOSITO', 'Ronnyscley',  2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (12, '2021-04-08', 1.47, 'SAQUE', null, 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (13, '2019-03-03', 7.86, 'TRANSFERENCIA','Ronnyscley', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (14, '2021-08-10', 94.68, 'SAQUE', null, 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (15, '2020-07-01', 840.13, 'TRANSFERENCIA', null, 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (16, '2020-01-03', 216.58, 'SAQUE', 'Ronnyscley', 1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (17, '2019-12-24', 636.05, 'SAQUE', null, 1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (18, '2020-03-31', 795.45, 'DEPOSITO', null, 1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (19, '2021-05-24', 247.97, 'TRANSFERENCIA', null,  1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (20, '2021-10-24', 407.45, 'DEPOSITO', null, 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (21, '2021-02-20', 847.88, 'DEPOSITO', 'Beltrano', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (22, '2018-12-24', 262.89, 'SAQUE', 'Beltrano', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (23, '2019-03-23', 814.73, 'SAQUE', 'Ronnyscley', 2);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (24, '2021-03-02', 349.76, 'TRANSFERENCIA', 'Ronnyscley', 1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (25, '2021-12-15', 307.01, 'DEPOSITO', 'Ronnyscley', 1);
insert into transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) values (26, '2019-08-25', 97.88, 'TRANSFERENCIA', 'Beltrano', 1);
