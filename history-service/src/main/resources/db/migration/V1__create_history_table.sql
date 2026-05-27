CREATE TABLE IF NOT EXISTS conversion_history (
    id BIGSERIAL PRIMARY KEY,
    from_currency VARCHAR(3) NOT NULL,
    to_currency VARCHAR(3) NOT NULL,
    amount NUMERIC(19,4) NOT NULL,
    converted_amount NUMERIC(19,4) NOT NULL,
    converted_at TIMESTAMP NOT NULL
);
