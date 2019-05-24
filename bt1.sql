drop database if exists QLITHUVIEN;
drop table if exists SACH;
drop table if exists DOCGIA;
drop table if exists PHIEUMUON;
CREATE database QLITHUVIEN;
create table SACH (
	masach int primary key not null,
	ten varchar(30) not null,
	nxb varchar(30) not null,
	soluong int not null
);
create table DOCGIA (
	sothe int primary key not null,
	ten varchar(30) not null,
	khoa varchar(30) not null,
	khoahoc varchar(30) not null,
	thoihanthe date
);
create table PHIEUMUON (
	masach int not null,
	sothe int not null,
	ngaymuon date,
	ngaytra date,
	ghichu varchar(255),
	primary key (masach, sothe)
);

insert into SACH(masach, ten, nxb, soluong)
value(1, 'a', 'aab', 200);
insert into SACH(masach, ten, nxb, soluong)
value(2, 'b', 'aab', 200);
insert into SACH(masach, ten, nxb, soluong)
value(3, 'c', 'aab', 200);
insert into SACH(masach, ten, nxb, soluong)
value(4, 'd', 'aab', 200);
insert into SACH(masach, ten, nxb, soluong)
value(5, 'e', 'aab', 200);

update SACH 
set ten = 'aac', soluong = 250
where masach = 2;

delete from SACH
where masach = 5;

insert into DOCGIA(sothe, ten, khoa, khoahoc, thoihanthe)
value(1, 'lung thi lo', 'mama', 'nani', "2009-12-12");
insert into DOCGIA(sothe, ten, khoa, khoahoc, thoihanthe)
value(2, 'lung thi la', 'aama', 'nani', "2009-1-12");
insert into DOCGIA(sothe, ten, khoa, khoahoc, thoihanthe)
value(5, 'lung thi lp', 'nama', 'nani', "2015-1-12");

select ten, khoa from docgia
order by khoa desc;





