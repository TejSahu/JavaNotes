# Load Average
In a Linux system, the load is a measure of CPU utilization at any given moment.

It refers to the number of processes which are either currently being executed by the CPU or are waiting for execution.

An idle system has a load of 0. With each process that is being executed or is on the waitlist, the load increases by 1.

While a load of 1 can mean approximately 100% resource usage on a single processor system, such systems are practically non-existent today. Unless you haven’t upgraded your system in over a decade, your system should run on a multi-core processor.

For a dual-core processor, a load of 1 means that 1 core was 100% idle. This translates to approximately 50% CPU usage. Similarly, it would represent 25% CPU usage for a quad-core processor.

Load Average in Linux takes into account the waiting threads and tasks along with processes being executed. Also, it is an average value instead of being an instantaneous value.

To understand more read here https://www.digitalocean.com/community/tutorials/load-average-in-linux