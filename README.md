# KafkaProjectDemo
Microservices that can take an input of an order, and store it in a database. Then the order will be consumed and an inventory database will have the quantities of it's wares changed.

## Steps to run:
1. Run first lines from sql init file (create databases)
2. Run Producer service first (ApacheKafkaOrdersProducer) as Spring Boot App
3. Run Consumer service second (ApacheKafkaInventoryConsumer) as Spring Boot App
4. Run second lines from sql init file (populates Inventory DB with dummy data)
