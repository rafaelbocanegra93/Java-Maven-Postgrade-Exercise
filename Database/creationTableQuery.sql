-- Table: public.Empleados

-- DROP TABLE IF EXISTS public."Empleados";

CREATE TABLE IF NOT EXISTS public."Empleados"
(
    "IdEmpleado" integer NOT NULL,
    "Nombre" text COLLATE pg_catalog."default" NOT NULL,
    "Meses" integer NOT NULL,
    "Salario" integer NOT NULL
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Empleados"
    OWNER to root;