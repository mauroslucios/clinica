insert into tb_specialty(name) values('ginecologista');
insert into tb_specialty(name) values('ortopedista');
insert into tb_specialty(name) values('dentista');
insert into tb_specialty(name) values('psicologa');

insert into tb_doctor(crm,name,specialty_id) values('30111969','mauro lucio pereira da silva',1);
insert into tb_doctor(crm,name,specialty_id) values('03112003','everton cristian c p silva',2);
insert into tb_doctor(crm,name,specialty_id) values('04112005','ethelin helna c p da silva',3);
insert into tb_doctor(crm,name,specialty_id) values('22082010','evelin c p da silva',4);


insert into tb_query  (moment,status,doctor_id,patient_id) values ('2019-07-15 15:45:42',1,1,1);
insert into tb_query  (moment,status,doctor_id,patient_id) values ('2019-08-16 17:00:42',2,2,2);
insert into tb_query  (moment,status,doctor_id,patient_id) values ('2019-09-17 12:00:00',3,3,3);
insert into tb_query  (moment,status,doctor_id,patient_id) values ('2019-10-18 10:00:00',4,4,4);




insert into tb_patient(birth,cpf,name) values('19790720','03008272843','roberta  cruz esch');
insert into tb_patient(birth,cpf,name) values('19800615','03008272843','juream todorov');
insert into tb_patient(birth,cpf,name) values('19760721','03008272843','fabiana braga');
insert into tb_patient(birth,cpf,name) values('19760823','03008272843','margaete muniz');



