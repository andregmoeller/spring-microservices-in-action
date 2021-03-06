CREATE TABLE LICENSE (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY,
	organization_id varchar(255) not null,
	product_name varchar(255) not null,
	license_type varchar(255) not null,
);

create sequence license_sequence start with 1 increment by 1;

insert into LICENSE (organization_id, product_name, license_type) values ('Acme Corporation', 'Acme DOS', 'Subscription');
