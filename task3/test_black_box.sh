#!/bin/bash --

ant compile
cd build
echo  > /tmp/lab1_testing_itmo_log
echo "Testing..."
java Scene 0 0 0 0 > /tmp/lab1_testing_itmo_log
java Scene 0 0 0 1 >> /tmp/lab1_testing_itmo_log
java Scene 0 0 1 0 >> /tmp/lab1_testing_itmo_log
java Scene 0 0 1 1 >> /tmp/lab1_testing_itmo_log
java Scene 0 1 0 0 >> /tmp/lab1_testing_itmo_log
java Scene 0 1 0 1 >> /tmp/lab1_testing_itmo_log
java Scene 0 1 1 0 >> /tmp/lab1_testing_itmo_log
java Scene 0 1 1 1 >> /tmp/lab1_testing_itmo_log
java Scene 1 0 0 0 >> /tmp/lab1_testing_itmo_log
java Scene 1 0 0 1 >> /tmp/lab1_testing_itmo_log
java Scene 1 0 1 0 >> /tmp/lab1_testing_itmo_log
java Scene 1 0 1 1 >> /tmp/lab1_testing_itmo_log
java Scene 1 1 0 0 >> /tmp/lab1_testing_itmo_log
java Scene 1 1 0 1 >> /tmp/lab1_testing_itmo_log
java Scene 1 1 1 0 >> /tmp/lab1_testing_itmo_log
java Scene 1 1 1 1 >> /tmp/lab1_testing_itmo_log

cd ..
echo "Comparing with stock. If no diffs are shown then tests are OK."
diff /tmp/lab1_testing_itmo_log stock_log
