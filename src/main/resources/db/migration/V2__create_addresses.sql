CREATE TABLE IF NOT EXISTS addresses (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  street VARCHAR(255) NOT NULL,
  city   VARCHAR(255) NOT NULL,
  state  VARCHAR(255) NOT NULL,
  zip    VARCHAR(255) NOT NULL,
  user_id BIGINT NOT NULL,
  CONSTRAINT fk_addresses_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
  INDEX idx_addresses_user_id (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
