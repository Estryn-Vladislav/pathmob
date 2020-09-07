insert into types (type)
values ('Congenital heart defects');

insert into pathologies (name, type_id)
values ('Patent ductus arteriosus', 1);

insert into subtypes (subtype, model, cut, hemodynamic)
values (
'wide and short',
'https://sketchfab.com/3d-models/a1-fea8908d2b01473eb11d517f71016ab6',
'https://sketchfab.com/3d-models/f1-cut-17c0626b559d45caaaa7e5d49a0541d6',
'https://sketchfab.com/3d-models/f1-b89189fff800459d8c4f32542626f032'
),
(
'conical',
'https://sketchfab.com/3d-models/a1-fea8908d2b01473eb11d517f71016ab6',
'https://sketchfab.com/3d-models/f1-cut-17c0626b559d45caaaa7e5d49a0541d6',
'https://sketchfab.com/3d-models/f1-b89189fff800459d8c4f32542626f032'
);

insert into pathologies_subtypes (pathology_id, subtypes_id)
values (1, 1), (1, 2);