CREATE TABLE `blog_php`.`users` (
    `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(200) NOT NULL,
    `email` VARCHAR(200) NOT NULL,
    `password` VARCHAR(200) NOT NULL,
    `birthday` DATE,
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP(),
    `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP(),
    `deleted_at` DATETIME,
    PRIMARY KEY (`id`)
);