--V2: Migrations para adicionar a coluna de RANK na tabela de cadastros de ninjas

ALTER TABLE tb_cadastro_ninjas
ADD COLUMN rank VARCHAR(255);