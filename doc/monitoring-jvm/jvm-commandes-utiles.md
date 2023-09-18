# dmesg 
Pour analyser si la JVM est crachée ou si il y des OutOfMemory

`djermouni@srvdps601:[~]: dmesg -T
[lun. janv.  3 10:33:47 2022] Node 0 hugepages_total=0 hugepages_free=0 hugepages_surp=0 hugepages_size=2048kB
[lun. janv.  3 10:33:47 2022] 125434 total pagecache pages
[lun. janv.  3 10:33:47 2022] 120067 pages in swap cache
[lun. janv.  3 10:33:47 2022] Swap cache stats: add 666777388, delete 666615942, find 394267832/521442954
[lun. janv.  3 10:33:47 2022] Free swap  = 3143388kB
[lun. janv.  3 10:33:47 2022] Total swap = 6291452kB
[lun. janv.  3 10:33:47 2022] 2097005 pages RAM
[lun. janv.  3 10:33:47 2022] 0 pages HighMem/MovableOnly
[lun. janv.  3 10:33:47 2022] 99491 pages reserved
[jeu. janv. 27 01:41:11 2022] hrtimer: interrupt took 6635757 ns
[mar. mars 22 09:18:20 2022] sd 0:0:1:0: [sdb] 1468006400 512-byte logical blocks: (751 GB/700 GiB)
[mar. mars 22 09:18:20 2022] sdb: detected capacity change from 644245094400 to 751619276800
`