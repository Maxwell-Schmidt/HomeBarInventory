USE BarInventory;

CREATE TABLE `BarInventory`.`Component` (
  `component_id` INT NOT NULL auto_increment,
  `shelf_id` INT NOT NULL,
  `name` TEXT NOT NULL,
  `quantity` float NOT NULL,
  `size` float,
  `cost` float,
  `stock_limit` float,
  PRIMARY KEY (`component_id`)
);

CREATE TABLE `BarInventory`.`Mixer` (
  `mixer_id` INT NOT NULL auto_increment,
  `name` TEXT NOT NULL,
  `cost` float,
  PRIMARY KEY (`mixer_id`)
);

CREATE TABLE `BarInventory`.`Mixer_Components` (
  `mixer_component_id` INT NOT NULL auto_increment,
  `mixer_id` INT NOT NULL,
  `component_id` INT NOT NULL,
  `component_amount` float NOT NULL,
  PRIMARY KEY (`mixer_component_id`)
);

CREATE TABLE `BarInventory`.`Shelf` (
  `shelf_id` INT NOT NULL auto_increment,
  `name` TEXT NOT NULL,
  PRIMARY KEY (`shelf_id`)
);

alter table `BarInventory`.`Mixer_Components` add constraint `mixcomp_fk_mixer_id` foreign key (mixer_id) references Mixer(mixer_id);
alter table `BarInventory`.`Mixer_Components` add constraint `mixcomp_fk_component_id` foreign key (component_id) references Component(component_id);
alter table `BarInventory`.`Component` add constraint `component_fk_shelf_id` foreign key (shelf_id) references Shelf(shelf_id);

alter table `BarInventory`.`Mixer` add UNIQUE (name(100));
alter table `BarInventory`.`Shelf` add UNIQUE (name(100));
alter table `BarInventory`.`Component` add UNIQUE (name(100));