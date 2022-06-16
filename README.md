# DB Migration using flyway
#### An exercise to get hands-on experience on db migration using flyway.

### Task TODO
```aidl
- Create a Gradle project 
- Add flyway dependency
- Write migrations for the following: 
         * Create tables
           users(id, name, address)
           products(id, name, price)

         * Alter tables
           Alter ‘name’ field to ‘full_name’ in users table
           Adding primary phone number to the users table

         * Create tables
           carts(id, user_id)
           cart_items(id, cart_id, product_id, quantity)
```