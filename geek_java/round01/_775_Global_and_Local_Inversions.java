package round01;

import java.util.Map;

public class _775_Global_and_Local_Inversions {
    public static void main(String[] args) {
        int[] A = new int[]{1, 0, 2};
        System.out.println(isIdealPermutation(A));
        A = new int[]{1, 2, 0};
        System.out.println(isIdealPermutation(A));
        A = new int[]{1, 0, 2, 3, 5, 4, 6, 7, 8, 10, 9, 11, 12, 13, 15, 14, 17, 16, 19, 18, 20, 22, 21, 23, 24, 26, 25, 28, 27, 29, 31, 30, 32, 33, 35, 34, 36, 38, 37, 39, 41, 40, 43, 42, 44, 45, 46, 48, 47, 49, 50, 51, 52, 54, 53, 55, 57, 56, 58, 60, 59, 61, 63, 62, 64, 65, 66, 68, 67, 70, 69, 72, 71, 74, 73, 75, 77, 76, 79, 78, 81, 80, 83, 82, 84, 86, 85, 88, 87, 89, 91, 90, 92, 93, 94, 95, 97, 96, 98, 99, 101, 100, 103, 102, 104, 106, 105, 107, 109, 108, 111, 110, 112, 113, 115, 114, 117, 116, 119, 118, 120, 122, 121, 123, 125, 124, 127, 126, 128, 130, 129, 131, 132, 134, 133, 136, 135, 138, 137, 140, 139, 141, 142, 143, 144, 146, 145, 147, 149, 148, 150, 152, 151, 153, 154, 155, 157, 156, 158, 160, 159, 161, 163, 162, 165, 164, 166, 168, 167, 170, 169, 171, 172, 173, 175, 174, 176, 178, 177, 180, 179, 182, 181, 183, 184, 185, 187, 186, 189, 188, 190, 191, 193, 192, 194, 195, 196, 198, 197, 200, 199, 201, 202, 203, 204, 206, 205, 208, 207, 210, 209, 211, 212, 213, 214, 215, 216, 218, 217, 219, 221, 220, 222, 224, 223, 226, 225, 228, 227, 229, 231, 230, 232, 233, 234, 235, 237, 236, 238, 240, 239, 241, 242, 244, 243, 245, 246, 247, 248, 249, 250, 251, 252, 253, 255, 254, 257, 256, 258, 260, 259, 262, 261, 264, 263, 265, 267, 266, 269, 268, 270, 272, 271, 273, 275, 274, 277, 276, 278, 280, 279, 282, 281, 283, 285, 284, 286, 287, 289, 288, 291, 290, 293, 292, 295, 294, 296, 297, 299, 298, 300, 302, 301, 304, 303, 305, 307, 306, 308, 310, 309, 311, 313, 312, 315, 314, 316, 318, 317, 320, 319, 321, 323, 322, 324, 326, 325, 328, 327, 329, 330, 331, 332, 333, 335, 334, 336, 337, 339, 338, 340, 342, 341, 343, 345, 344, 346, 348, 347, 350, 349, 351, 353, 352, 355, 354, 356, 357, 359, 358, 360, 362, 361, 364, 363, 366, 365, 367, 369, 368, 370, 372, 371, 373, 375, 374, 377, 376, 378, 379, 381, 380, 383, 382, 384, 385, 387, 386, 389, 388, 390, 391, 393, 392, 394, 396, 395, 398, 397, 399, 401, 400, 402, 403, 405, 404, 407, 406, 409, 408, 410, 411, 412, 414, 413, 415, 417, 416, 418, 420, 419, 422, 421, 424, 423, 426, 425, 428, 427, 429, 430, 432, 431, 434, 433, 436, 435, 437, 438, 440, 439, 442, 441, 444, 443, 445, 446, 447, 448, 449, 451, 450, 453, 452, 454, 456, 455, 458, 457, 459, 460, 461, 462, 464, 463, 466, 465, 468, 467, 470, 469, 472, 471, 474, 473, 476, 475, 477, 478, 479, 481, 480, 483, 482, 484, 485, 486, 487, 489, 488, 491, 490, 493, 492, 494, 496, 495, 498, 497, 500, 499, 501, 502, 504, 503, 505, 506, 508, 507, 510, 509, 511, 513, 512, 514, 516, 515, 517, 518, 520, 519, 522, 521, 523, 524, 525, 527, 526, 529, 528, 531, 530, 532, 534, 533, 536, 535, 538, 537, 539, 541, 540, 543, 542, 545, 544, 546, 548, 547, 549, 550, 552, 551, 554, 553, 556, 555, 558, 557, 560, 559, 562, 561, 563, 564, 566, 565, 568, 567, 569, 570, 571, 573, 572, 574, 575, 576, 577, 578, 579, 580, 581, 583, 582, 584, 585, 586, 587, 589, 588, 590, 592, 591, 593, 595, 594, 597, 596, 599, 598, 600, 601, 602, 603, 604, 606, 605, 608, 607, 610, 609, 612, 611, 614, 613, 616, 615, 618, 617, 620, 619, 621, 622, 623, 624, 626, 625, 628, 627, 630, 629, 631, 633, 632, 635, 634, 636, 638, 637, 640, 639, 641, 642, 644, 643, 645, 646, 648, 647, 650, 649, 651, 652, 653, 654, 656, 655, 658, 657, 660, 659, 661, 662, 664, 663, 665, 666, 667, 668, 670, 669, 671, 672, 673, 674, 676, 675, 677, 678, 679, 680, 681, 683, 682, 684, 685, 687, 686, 688, 690, 689, 692, 691, 693, 695, 694, 697, 696, 698, 700, 699, 702, 701, 703, 705, 704, 707, 706, 709, 708, 710, 712, 711, 713, 714, 716, 715, 718, 717, 720, 719, 721, 722, 724, 723, 726, 725, 728, 727, 730, 729, 732, 731, 734, 733, 736, 735, 738, 737, 740, 739, 742, 741, 743, 744, 745, 746, 747, 748, 749, 750, 752, 751, 754, 753, 755, 757, 756, 759, 758, 760, 762, 761, 763, 764, 766, 765, 767, 769, 768, 771, 770, 772, 773, 774, 775, 777, 776, 778, 779, 781, 780, 782, 784, 783, 786, 785, 788, 787, 790, 789, 792, 791, 794, 793, 795, 797, 796, 798, 800, 799, 801, 802, 804, 803, 805, 806, 808, 807, 809, 811, 810, 813, 812, 814, 816, 815, 818, 817, 819, 820, 821, 822, 824, 823, 825, 826, 828, 827, 829, 831, 830, 832, 834, 833, 836, 835, 837, 838, 840, 839, 841, 843, 842, 845, 844, 847, 846, 848, 849, 850, 851, 852, 854, 853, 856, 855, 857, 858, 860, 859, 862, 861, 863, 864, 865, 867, 866, 868, 869, 870, 872, 871, 873, 874, 875, 876, 878, 877, 880, 879, 881, 883, 882, 884, 885, 887, 886, 888, 889, 890, 892, 891, 893, 895, 894, 897, 896, 899, 898, 900, 901, 902, 903, 904, 905, 906, 907, 908, 910, 909, 912, 911, 913, 915, 914, 917, 916, 919, 918, 921, 920, 922, 923, 924, 925, 927, 926, 928, 930, 929, 932, 931, 934, 933, 935, 936, 937, 939, 938, 940, 941, 942, 944, 943, 946, 945, 948, 947, 949, 951, 950, 952, 953, 955, 954, 956, 958, 957, 959, 961, 960, 963, 962, 964, 966, 965, 968, 967, 969, 970, 972, 971, 973, 974, 976, 975, 977, 979, 978, 980, 981, 982, 983, 985, 984, 986, 987, 988, 990, 989, 991, 993, 992, 995, 994, 996, 997, 999, 998, 1000, 1002, 1001, 1003, 1004, 1006, 1005, 1008, 1007, 1010, 1009, 1012, 1011, 1014, 1013, 1016, 1015, 1017, 1019, 1018, 1021, 1020, 1023, 1022, 1025, 1024, 1027, 1026, 1028, 1029, 1030, 1032, 1031, 1033, 1035, 1034, 1036, 1037, 1038, 1039, 1040, 1042, 1041, 1044, 1043, 1046, 1045, 1048, 1047, 1049, 1051, 1050, 1053, 1052, 1054, 1055, 1056, 1058, 1057, 1060, 1059, 1061, 1063, 1062, 1065, 1064, 1066, 1067, 1068, 1069, 1070, 1071, 1073, 1072, 1075, 1074, 1077, 1076, 1078, 1079, 1081, 1080, 1082, 1084, 1083, 1086, 1085, 1087, 1088, 1089, 1090, 1092, 1091, 1094, 1093, 1096, 1095, 1097, 1098, 1100, 1099, 1102, 1101, 1103, 1104, 1106, 1105, 1108, 1107, 1110, 1109, 1111, 1112, 1113, 1115, 1114, 1117, 1116, 1119, 1118, 1120, 1121, 1122, 1123, 1125, 1124, 1126, 1127, 1129, 1128, 1131, 1130, 1133, 1132, 1134, 1135, 1137, 1136, 1138, 1139, 1140, 1142, 1141, 1144, 1143, 1146, 1145, 1147, 1148, 1149, 1150, 1152, 1151, 1154, 1153, 1156, 1155, 1158, 1157, 1160, 1159, 1162, 1161, 1164, 1163, 1166, 1165, 1168, 1167, 1170, 1169, 1171, 1172, 1174, 1173, 1175, 1177, 1176, 1178, 1180, 1179, 1181, 1182, 1184, 1183, 1186, 1185, 1187, 1189, 1188, 1191, 1190, 1193, 1192, 1195, 1194, 1197, 1196, 1198, 1199, 1201, 1200, 1202, 1203, 1205, 1204, 1207, 1206, 1209, 1208, 1211, 1210, 1212, 1213, 1214, 1215, 1216, 1218, 1217, 1219, 1220, 1221, 1223, 1222, 1225, 1224, 1227, 1226, 1229, 1228, 1230, 1231, 1233, 1232, 1234, 1236, 1235, 1237, 1238, 1239, 1241, 1240, 1243, 1242, 1245, 1244, 1247, 1246, 1249, 1248, 1251, 1250, 1252, 1254, 1253, 1255, 1256, 1258, 1257, 1260, 1259, 1261, 1262, 1264, 1263, 1265, 1266, 1267, 1269, 1268, 1270, 1272, 1271, 1273, 1274, 1276, 1275, 1278, 1277, 1279, 1281, 1280, 1283, 1282, 1285, 1284, 1286, 1288, 1287, 1290, 1289, 1291, 1292, 1294, 1293, 1295, 1297, 1296, 1298, 1300, 1299, 1301, 1303, 1302, 1304, 1305, 1306, 1308, 1307, 1310, 1309, 1311, 1313, 1312, 1315, 1314, 1317, 1316, 1318, 1319, 1320, 1322, 1321, 1324, 1323, 1325, 1327, 1326, 1329, 1328, 1331, 1330, 1333, 1332, 1334, 1336, 1335, 1337, 1339, 1338, 1341, 1340, 1342, 1343, 1345, 1344, 1347, 1346, 1349, 1348, 1351, 1350, 1353, 1352, 1354, 1356, 1355, 1358, 1357, 1360, 1359, 1361, 1363, 1362, 1365, 1364, 1367, 1366, 1368, 1369, 1370, 1371, 1372, 1374, 1373, 1375, 1377, 1376, 1378, 1379, 1381, 1380, 1383, 1382, 1385, 1384, 1386, 1388, 1387, 1389, 1390, 1391, 1392, 1394, 1393, 1395, 1396, 1398, 1397, 1399, 1401, 1400, 1402, 1403, 1404, 1405, 1407, 1406, 1408, 1409, 1411, 1410, 1413, 1412, 1415, 1414, 1417, 1416, 1419, 1418, 1420, 1421, 1422, 1423, 1424, 1426, 1425, 1428, 1427, 1430, 1429, 1432, 1431, 1434, 1433, 1436, 1435, 1438, 1437, 1440, 1439, 1441, 1442, 1444, 1443, 1445, 1446, 1448, 1447, 1450, 1449, 1452, 1451, 1453, 1455, 1454, 1457, 1456, 1459, 1458, 1460, 1461, 1462, 1463, 1465, 1464, 1466, 1467, 1469, 1468, 1470, 1472, 1471, 1474, 1473, 1476, 1475, 1477, 1479, 1478, 1480, 1481, 1482, 1483, 1485, 1484, 1486, 1488, 1487, 1489, 1490, 1491, 1492, 1493, 1494, 1495, 1496, 1498, 1497, 1499, 1501, 1500, 1503, 1502, 1504, 1505, 1507, 1506, 1509, 1508, 1510, 1512, 1511, 1513, 1514, 1515, 1516, 1517, 1518, 1519, 1520, 1521, 1523, 1522, 1524, 1525, 1526, 1527, 1528, 1529, 1531, 1530, 1532, 1533, 1534, 1535, 1537, 1536, 1538, 1539, 1541, 1540, 1543, 1542, 1544, 1545, 1546, 1547, 1549, 1548, 1550, 1552, 1551, 1554, 1553, 1556, 1555, 1557, 1559, 1558, 1560, 1561, 1563, 1562, 1564, 1565, 1567, 1566, 1568, 1570, 1569, 1572, 1571, 1573, 1575, 1574, 1576, 1577, 1579, 1578, 1581, 1580, 1583, 1582, 1585, 1584, 1587, 1586, 1588, 1589, 1591, 1590, 1592, 1594, 1593, 1595, 1596, 1598, 1597, 1599, 1601, 1600, 1602, 1604, 1603, 1605, 1607, 1606, 1608, 1609, 1611, 1610, 1612, 1614, 1613, 1616, 1615, 1618, 1617, 1619, 1620, 1621, 1622, 1623, 1625, 1624, 1627, 1626, 1628, 1629, 1631, 1630, 1633, 1632, 1635, 1634, 1636, 1637, 1639, 1638, 1641, 1640, 1642, 1644, 1643, 1646, 1645, 1647, 1649, 1648, 1650, 1651, 1652, 1653, 1655, 1654, 1657, 1656, 1658, 1660, 1659, 1661, 1663, 1662, 1664, 1665, 1666, 1668, 1667, 1669, 1671, 1670, 1672, 1673, 1675, 1674, 1677, 1676, 1678, 1680, 1679, 1681, 1682, 1684, 1683, 1685, 1686, 1688, 1687, 1690, 1689, 1691, 1692, 1694, 1693, 1695, 1696, 1698, 1697, 1699, 1700, 1702, 1701, 1704, 1703, 1705, 1706, 1708, 1707, 1709, 1710, 1711, 1712, 1714, 1713, 1716, 1715, 1717, 1719, 1718, 1721, 1720, 1723, 1722, 1725, 1724, 1727, 1726, 1729, 1728, 1731, 1730, 1732, 1734, 1733, 1736, 1735, 1738, 1737, 1740, 1739, 1741, 1743, 1742, 1745, 1744, 1746, 1747, 1748, 1750, 1749, 1752, 1751, 1754, 1753, 1755, 1757, 1756, 1758, 1760, 1759, 1761, 1763, 1762, 1764, 1765, 1766, 1768, 1767, 1770, 1769, 1771, 1773, 1772, 1775, 1774, 1776, 1777, 1779, 1778, 1780, 1781, 1783, 1782, 1784, 1785, 1787, 1786, 1788, 1789, 1790, 1791, 1792, 1794, 1793, 1795, 1797, 1796, 1799, 1798, 1800, 1801, 1802, 1804, 1803, 1806, 1805, 1808, 1807, 1809, 1811, 1810, 1813, 1812, 1814, 1815, 1817, 1816, 1818, 1819, 1821, 1820, 1823, 1822, 1825, 1824, 1827, 1826, 1828, 1829, 1830, 1831, 1832, 1834, 1833, 1836, 1835, 1838, 1837, 1840, 1839, 1841, 1843, 1842, 1844, 1846, 1845, 1848, 1847, 1850, 1849, 1852, 1851, 1854, 1853, 1855, 1856, 1857, 1859, 1858, 1861, 1860, 1862, 1863, 1865, 1864, 1866, 1867, 1869, 1868, 1871, 1870, 1872, 1874, 1873, 1875, 1876, 1878, 1877, 1880, 1879, 1882, 1881, 1884, 1883, 1885, 1887, 1886, 1889, 1888, 1891, 1890, 1892, 1893, 1894, 1895, 1896, 1897, 1899, 1898, 1901, 1900, 1902, 1904, 1903, 1906, 1905, 1907, 1908, 1909, 1910, 1911, 1912, 1913, 1914, 1916, 1915, 1918, 1917, 1920, 1919, 1921, 1923, 1922, 1925, 1924, 1927, 1926, 1929, 1928, 1930, 1932, 1931, 1933, 1934, 1936, 1935, 1938, 1937, 1939, 1941, 1940, 1943, 1942, 1945, 1944, 1947, 1946, 1949, 1948, 1951, 1950, 1953, 1952, 1954, 1955, 1957, 1956, 1958, 1959, 1961, 1960, 1962, 1964, 1963, 1966, 1965, 1968, 1967, 1970, 1969, 1972, 1971, 1973, 1975, 1974, 1976, 1977, 1978, 1980, 1979, 1981, 1983, 1982, 1984, 1986, 1985, 1987, 1989, 1988, 1990, 1992, 1991, 1994, 1993, 1996, 1995, 1998, 1997, 1999, 2000, 2002, 2001, 2004, 2003, 2005, 2006, 2008, 2007, 2010, 2009, 2011, 2012, 2014, 2013, 2016, 2015, 2017, 2019, 2018, 2021, 2020, 2022, 2024, 2023, 2025, 2027, 2026, 2028, 2029, 2031, 2030, 2033, 2032, 2035, 2034, 2036, 2037, 2039, 2038, 2041, 2040, 2042, 2044, 2043, 2045, 2047, 2046, 2049, 2048, 2051, 2050, 2053, 2052, 2054, 2056, 2055, 2057, 2058, 2060, 2059, 2062, 2061, 2064, 2063, 2065, 2067, 2066, 2068, 2069, 2070, 2072, 2071, 2074, 2073, 2076, 2075, 2077, 2079, 2078, 2080, 2082, 2081, 2084, 2083, 2086, 2085, 2087, 2088, 2089, 2090, 2092, 2091, 2093, 2094, 2095, 2096, 2097, 2099, 2098, 2100, 2102, 2101, 2104, 2103, 2105, 2106, 2108, 2107, 2109, 2111, 2110, 2113, 2112, 2115, 2114, 2117, 2116, 2119, 2118, 2120, 2122, 2121, 2123, 2125, 2124, 2127, 2126, 2128, 2130, 2129, 2131, 2133, 2132, 2135, 2134, 2137, 2136, 2139, 2138, 2140, 2142, 2141, 2143, 2145, 2144, 2147, 2146, 2149, 2148, 2151, 2150, 2153, 2152, 2155, 2154, 2156, 2158, 2157, 2159, 2160, 2162, 2161, 2164, 2163, 2165, 2167, 2166, 2169, 2168, 2171, 2170, 2172, 2173, 2174, 2176, 2175, 2177, 2179, 2178, 2180, 2182, 2181, 2184, 2183, 2185, 2187, 2186, 2188, 2190, 2189, 2192, 2191, 2193, 2194, 2195, 2197, 2196, 2198, 2200, 2199, 2201, 2202, 2203, 2204, 2206, 2205, 2207, 2209, 2208, 2211, 2210, 2213, 2212, 2214, 2215, 2217, 2216, 2219, 2218, 2220, 2222, 2221, 2223, 2224, 2226, 2225, 2228, 2227, 2229, 2230, 2232, 2231, 2233, 2234, 2235, 2237, 2236, 2239, 2238, 2241, 2240, 2243, 2242, 2244, 2246, 2245, 2247, 2249, 2248, 2251, 2250, 2252, 2254, 2253, 2256, 2255, 2258, 2257, 2259, 2261, 2260, 2263, 2262, 2265, 2264, 2267, 2266, 2268, 2269, 2270, 2271, 2272, 2273, 2275, 2274, 2276, 2277, 2279, 2278, 2280, 2281, 2283, 2282, 2285, 2284, 2286, 2288, 2287, 2289, 2291, 2290, 2293, 2292, 2294, 2296, 2295, 2297, 2298, 2300, 2299, 2302, 2301, 2304, 2303, 2305, 2306, 2307, 2309, 2308, 2311, 2310, 2312, 2314, 2313, 2316, 2315, 2317, 2318, 2319, 2321, 2320, 2322, 2324, 2323, 2325, 2327, 2326, 2329, 2328, 2330, 2331, 2333, 2332, 2335, 2334, 2336, 2338, 2337, 2340, 2339, 2341, 2342, 2343, 2344, 2345, 2346, 2347, 2348, 2349, 2350, 2352, 2351, 2353, 2354, 2355, 2357, 2356, 2359, 2358, 2361, 2360, 2363, 2362, 2365, 2364, 2366, 2367, 2368, 2370, 2369, 2371, 2372, 2374, 2373, 2376, 2375, 2377, 2378, 2380, 2379, 2381, 2382, 2384, 2383, 2385, 2386, 2387, 2389, 2388, 2391, 2390, 2392, 2393, 2395, 2394, 2396, 2397, 2399, 2398, 2400, 2402, 2401, 2403, 2405, 2404, 2406, 2407, 2409, 2408, 2411, 2410, 2413, 2412, 2415, 2414, 2417, 2416, 2418, 2419, 2420, 2422, 2421, 2423, 2425, 2424, 2426, 2428, 2427, 2430, 2429, 2432, 2431, 2434, 2433, 2436, 2435, 2438, 2437, 2439, 2441, 2440, 2443, 2442, 2444, 2445, 2446, 2447, 2449, 2448, 2450, 2451, 2452, 2454, 2453, 2455, 2456, 2457, 2458, 2459, 2461, 2460, 2462, 2463, 2464, 2465, 2467, 2466, 2468, 2469, 2470, 2471, 2472, 2473, 2475, 2474, 2477, 2476, 2478, 2480, 2479, 2482, 2481, 2484, 2483, 2485, 2486, 2488, 2487, 2489, 2491, 2490, 2493, 2492, 2495, 2494, 2496, 2497, 2499, 2498, 2501, 2500, 2503, 2502, 2504, 2506, 2505, 2507, 2508, 2510, 2509, 2512, 2511, 2514, 2513, 2516, 2515, 2517, 2519, 2518, 2520, 2522, 2521, 2524, 2523, 2525, 2526, 2528, 2527, 2530, 2529, 2532, 2531, 2533, 2535, 2534, 2536, 2538, 2537, 2539, 2541, 2540, 2543, 2542, 2545, 2544, 2546, 2547, 2549, 2548, 2550, 2552, 2551, 2553, 2555, 2554, 2557, 2556, 2558, 2559, 2561, 2560, 2562, 2564, 2563, 2566, 2565, 2567, 2568, 2570, 2569, 2571, 2573, 2572, 2575, 2574, 2577, 2576, 2579, 2578, 2580, 2581, 2582, 2583, 2585, 2584, 2586, 2587, 2589, 2588, 2590, 2592, 2591, 2593, 2595, 2594, 2596, 2597, 2599, 2598, 2601, 2600, 2603, 2602, 2604, 2605, 2606, 2607, 2608, 2609, 2610, 2612, 2611, 2613, 2615, 2614, 2616, 2618, 2617, 2620, 2619, 2622, 2621, 2623, 2624, 2625, 2627, 2626, 2629, 2628, 2631, 2630, 2632, 2634, 2633, 2636, 2635, 2638, 2637, 2639, 2640, 2641, 2642, 2644, 2643, 2645, 2647, 2646, 2649, 2648, 2651, 2650, 2652, 2653, 2655, 2654, 2656, 2657, 2658, 2659, 2661, 2660, 2663, 2662, 2665, 2664, 2666, 2667, 2668, 2670, 2669, 2672, 2671, 2674, 2673, 2676, 2675, 2678, 2677, 2680, 2679, 2682, 2681, 2684, 2683, 2686, 2685, 2687, 2689, 2688, 2691, 2690, 2693, 2692, 2695, 2694, 2697, 2696, 2698, 2700, 2699, 2702, 2701, 2704, 2703, 2705, 2706, 2707, 2709, 2708, 2711, 2710, 2713, 2712, 2715, 2714, 2717, 2716, 2718, 2719, 2721, 2720, 2722, 2724, 2723, 2726, 2725, 2728, 2727, 2729, 2731, 2730, 2733, 2732, 2734, 2736, 2735, 2737, 2738, 2739, 2741, 2740, 2742, 2743, 2744, 2745, 2747, 2746, 2748, 2750, 2749, 2752, 2751, 2754, 2753, 2755, 2756, 2757, 2759, 2758, 2760, 2761, 2762, 2764, 2763, 2766, 2765, 2768, 2767, 2770, 2769, 2771, 2773, 2772, 2774, 2776, 2775, 2778, 2777, 2779, 2780, 2781, 2783, 2782, 2784, 2785, 2786, 2787, 2789, 2788, 2790, 2792, 2791, 2793, 2794, 2796, 2795, 2797, 2799, 2798, 2800, 2802, 2801, 2804, 2803, 2806, 2805, 2808, 2807, 2809, 2811, 2810, 2813, 2812, 2815, 2814, 2816, 2817, 2818, 2820, 2819, 2821, 2823, 2822, 2825, 2824, 2827, 2826, 2828, 2830, 2829, 2832, 2831, 2834, 2833, 2836, 2835, 2837, 2839, 2838, 2841, 2840, 2843, 2842, 2845, 2844, 2847, 2846, 2849, 2848, 2850, 2852, 2851, 2854, 2853, 2856, 2855, 2857, 2859, 2858, 2861, 2860, 2863, 2862, 2864, 2865, 2867, 2866, 2868, 2869, 2870, 2872, 2871, 2873, 2875, 2874, 2877, 2876, 2878, 2880, 2879, 2881, 2883, 2882, 2885, 2884, 2886, 2888, 2887, 2890, 2889, 2891, 2893, 2892, 2894, 2896, 2895, 2897, 2899, 2898, 2900, 2902, 2901, 2903, 2905, 2904, 2906, 2907, 2908, 2909, 2911, 2910, 2912, 2914, 2913, 2916, 2915, 2917, 2918, 2920, 2919, 2921, 2923, 2922, 2924, 2925, 2926, 2928, 2927, 2930, 2929, 2931, 2932, 2933, 2934, 2936, 2935, 2938, 2937, 2940, 2939, 2942, 2941, 2944, 2943, 2946, 2945, 2947, 2948, 2950, 2949, 2951, 2952, 2953, 2955, 2954, 2957, 2956, 2959, 2958, 2961, 2960, 2963, 2962, 2964, 2966, 2965, 2968, 2967, 2969, 2970, 2972, 2971, 2974, 2973, 2975, 2977, 2976, 2979, 2978, 2981, 2980, 2983, 2982, 2985, 2984, 2987, 2986, 2989, 2988, 2991, 2990, 2993, 2992, 2994, 2995, 2996, 2998, 2997, 3000, 2999, 3001, 3002, 3004, 3003, 3006, 3005, 3008, 3007, 3010, 3009, 3011, 3013, 3012, 3015, 3014, 3017, 3016, 3018, 3019, 3021, 3020, 3022, 3024, 3023, 3026, 3025, 3028, 3027, 3030, 3029, 3031, 3033, 3032, 3035, 3034, 3036, 3037, 3038, 3040, 3039, 3041, 3043, 3042, 3045, 3044, 3046, 3047, 3049, 3048, 3051, 3050, 3052, 3053, 3055, 3054, 3057, 3056, 3058, 3059, 3061, 3060, 3063, 3062, 3064, 3065, 3067, 3066, 3068, 3070, 3069, 3071, 3073, 3072, 3074, 3075, 3076, 3078, 3077, 3079, 3080, 3082, 3081, 3083, 3084, 3086, 3085, 3088, 3087, 3089, 3091, 3090, 3092, 3094, 3093, 3096, 3095, 3098, 3097, 3100, 3099, 3102, 3101, 3104, 3103, 3105, 3106, 3107, 3108, 3109, 3110, 3111, 3112, 3114, 3113, 3115, 3117, 3116, 3118, 3120, 3119, 3122, 3121, 3124, 3123, 3125, 3126, 3127, 3128, 3129, 3131, 3130, 3132, 3133, 3135, 3134, 3136, 3138, 3137, 3139, 3140, 3141, 3142, 3144, 3143, 3146, 3145, 3148, 3147, 3150, 3149, 3152, 3151, 3153, 3155, 3154, 3156, 3158, 3157, 3160, 3159, 3162, 3161, 3164, 3163, 3166, 3165, 3168, 3167, 3169, 3170, 3171, 3173, 3172, 3175, 3174, 3177, 3176, 3179, 3178, 3181, 3180, 3183, 3182, 3185, 3184, 3186, 3188, 3187, 3189, 3190, 3191, 3193, 3192, 3195, 3194, 3196, 3197, 3199, 3198, 3200, 3201, 3202, 3204, 3203, 3206, 3205, 3208, 3207, 3209, 3211, 3210, 3212, 3214, 3213, 3216, 3215, 3217, 3219, 3218, 3221, 3220, 3222, 3224, 3223, 3226, 3225, 3227, 3228, 3229, 3231, 3230, 3233, 3232, 3235, 3234, 3236, 3238, 3237, 3239, 3240, 3241, 3242, 3244, 3243, 3245, 3247, 3246, 3249, 3248, 3250, 3252, 3251, 3254, 3253, 3255, 3256, 3257, 3258, 3259, 3260, 3262, 3261, 3264, 3263, 3266, 3265, 3268, 3267, 3269, 3270, 3272, 3271, 3274, 3273, 3276, 3275, 3278, 3277, 3279, 3280, 3282, 3281, 3284, 3283, 3286, 3285, 3287, 3289, 3288, 3291, 3290, 3293, 3292, 3295, 3294, 3296, 3298, 3297, 3299, 3300, 3302, 3301, 3303, 3304, 3306, 3305, 3308, 3307, 3309, 3310, 3312, 3311, 3313, 3314, 3316, 3315, 3318, 3317, 3320, 3319, 3322, 3321, 3323, 3325, 3324, 3326, 3327, 3329, 3328, 3330, 3331, 3333, 3332, 3334, 3336, 3335, 3337, 3338, 3340, 3339, 3341, 3343, 3342, 3345, 3344, 3346, 3347, 3349, 3348, 3350, 3352, 3351, 3353, 3355, 3354, 3357, 3356, 3358, 3360, 3359, 3361, 3363, 3362, 3364, 3365, 3366, 3367, 3368, 3370, 3369, 3372, 3371, 3373, 3374, 3376, 3375, 3377, 3379, 3378, 3381, 3380, 3383, 3382, 3384, 3385, 3387, 3386, 3389, 3388, 3391, 3390, 3393, 3392, 3395, 3394, 3396, 3398, 3397, 3399, 3400, 3402, 3401, 3404, 3403, 3406, 3405, 3407, 3408, 3409, 3410, 3412, 3411, 3413, 3415, 3414, 3417, 3416, 3419, 3418, 3421, 3420, 3422, 3423, 3424, 3425, 3427, 3426, 3429, 3428, 3430, 3431, 3433, 3432, 3435, 3434, 3437, 3436, 3439, 3438, 3441, 3440, 3442, 3443, 3444, 3446, 3445, 3447, 3448, 3449, 3451, 3450, 3453, 3452, 3454, 3456, 3455, 3457, 3459, 3458, 3461, 3460, 3462, 3464, 3463, 3466, 3465, 3468, 3467, 3469, 3470, 3471, 3473, 3472, 3475, 3474, 3477, 3476, 3478, 3480, 3479, 3481, 3483, 3482, 3484, 3485, 3487, 3486, 3488, 3489, 3491, 3490, 3492, 3494, 3493, 3495, 3497, 3496, 3499, 3498, 3500, 3502, 3501, 3504, 3503, 3505, 3506, 3507, 3508, 3509, 3511, 3510, 3513, 3512, 3514, 3515, 3516, 3518, 3517, 3520, 3519, 3521, 3522, 3524, 3523, 3525, 3526, 3528, 3527, 3529, 3530, 3531, 3532, 3533, 3535, 3534, 3537, 3536, 3539, 3538, 3540, 3541, 3542, 3544, 3543, 3545, 3546, 3548, 3547, 3550, 3549, 3551, 3553, 3552, 3554, 3556, 3555, 3558, 3557, 3559, 3561, 3560, 3562, 3563, 3564, 3566, 3565, 3568, 3567, 3570, 3569, 3572, 3571, 3574, 3573, 3575, 3577, 3576, 3578, 3580, 3579, 3582, 3581, 3584, 3583, 3586, 3585, 3588, 3587, 3590, 3589, 3592, 3591, 3594, 3593, 3595, 3596, 3597, 3599, 3598, 3600, 3602, 3601, 3603, 3605, 3604, 3607, 3606, 3609, 3608, 3610, 3612, 3611, 3614, 3613, 3615, 3617, 3616, 3618, 3620, 3619, 3622, 3621, 3623, 3624, 3626, 3625, 3628, 3627, 3630, 3629, 3631, 3632, 3633, 3635, 3634, 3636, 3637, 3638, 3640, 3639, 3641, 3643, 3642, 3644, 3645, 3646, 3647, 3649, 3648, 3650, 3652, 3651, 3654, 3653, 3656, 3655, 3657, 3658, 3659, 3660, 3661, 3662, 3663, 3664, 3666, 3665, 3668, 3667, 3669, 3670, 3672, 3671, 3673, 3675, 3674, 3677, 3676, 3678, 3680, 3679, 3681, 3682, 3683, 3685, 3684, 3687, 3686, 3689, 3688, 3690, 3691, 3692, 3694, 3693, 3696, 3695, 3698, 3697, 3700, 3699, 3701, 3702, 3704, 3703, 3706, 3705, 3708, 3707, 3710, 3709, 3711, 3713, 3712, 3715, 3714, 3716, 3718, 3717, 3720, 3719, 3722, 3721, 3723, 3725, 3724, 3726, 3727, 3729, 3728, 3731, 3730, 3733, 3732, 3735, 3734, 3737, 3736, 3738, 3740, 3739, 3741, 3743, 3742, 3744, 3746, 3745, 3748, 3747, 3749, 3751, 3750, 3752, 3754, 3753, 3756, 3755, 3758, 3757, 3759, 3760, 3762, 3761, 3763, 3765, 3764, 3766, 3768, 3767, 3770, 3769, 3771, 3772, 3773, 3774, 3776, 3775, 3777, 3779, 3778, 3780, 3781, 3783, 3782, 3784, 3785, 3787, 3786, 3789, 3788, 3791, 3790, 3793, 3792, 3794, 3795, 3797, 3796, 3799, 3798, 3801, 3800, 3803, 3802, 3805, 3804, 3806, 3808, 3807, 3810, 3809, 3812, 3811, 3813, 3814, 3816, 3815, 3817, 3819, 3818, 3820, 3822, 3821, 3824, 3823, 3825, 3826, 3827, 3828, 3830, 3829, 3831, 3832, 3833, 3834, 3835, 3837, 3836, 3839, 3838, 3840, 3841, 3843, 3842, 3844, 3846, 3845, 3848, 3847, 3849, 3850, 3852, 3851, 3853, 3854, 3856, 3855, 3857, 3858, 3860, 3859, 3861, 3862, 3864, 3863, 3865, 3866, 3867, 3869, 3868, 3871, 3870, 3873, 3872, 3875, 3874, 3876, 3877, 3879, 3878, 3880, 3882, 3881, 3883, 3884, 3885, 3887, 3886, 3889, 3888, 3891, 3890, 3893, 3892, 3895, 3894, 3896, 3897, 3898, 3899, 3901, 3900, 3903, 3902, 3904, 3905, 3907, 3906, 3909, 3908, 3911, 3910, 3912, 3914, 3913, 3916, 3915, 3917, 3919, 3918, 3920, 3921, 3923, 3922, 3924, 3926, 3925, 3928, 3927, 3929, 3931, 3930, 3932, 3933, 3934, 3935, 3936, 3937, 3938, 3939, 3940, 3942, 3941, 3943, 3945, 3944, 3946, 3948, 3947, 3950, 3949, 3952, 3951, 3953, 3955, 3954, 3956, 3958, 3957, 3960, 3959, 3962, 3961, 3963, 3964, 3965, 3967, 3966, 3968, 3969, 3971, 3970, 3972, 3973, 3974, 3975, 3976, 3977, 3979, 3978, 3981, 3980, 3982, 3983, 3984, 3986, 3985, 3988, 3987, 3989, 3991, 3990, 3992, 3994, 3993, 3996, 3995, 3997, 3999, 3998, 4001, 4000, 4003, 4002, 4005, 4004, 4006, 4008, 4007, 4010, 4009, 4012, 4011, 4014, 4013, 4015, 4016, 4018, 4017, 4020, 4019, 4021, 4022, 4024, 4023, 4026, 4025, 4028, 4027, 4029, 4031, 4030, 4032, 4034, 4033, 4036, 4035, 4037, 4038, 4040, 4039, 4041, 4043, 4042, 4044, 4045, 4047, 4046, 4049, 4048, 4050, 4051, 4053, 4052, 4055, 4054, 4056, 4058, 4057, 4060, 4059, 4061, 4062, 4063, 4065, 4064, 4067, 4066, 4069, 4068, 4070, 4072, 4071, 4074, 4073, 4075, 4077, 4076, 4078, 4079, 4080, 4082, 4081, 4083, 4085, 4084, 4087, 4086, 4089, 4088, 4091, 4090, 4093, 4092, 4094, 4095, 4096, 4098, 4097, 4099, 4100, 4102, 4101, 4103, 4104, 4105, 4107, 4106, 4108, 4110, 4109, 4111, 4113, 4112, 4115, 4114, 4117, 4116, 4118, 4120, 4119, 4121, 4123, 4122, 4124, 4126, 4125, 4128, 4127, 4130, 4129, 4132, 4131, 4134, 4133, 4136, 4135, 4137, 4138, 4140, 4139, 4142, 4141, 4143, 4145, 4144, 4147, 4146, 4148, 4149, 4151, 4150, 4153, 4152, 4154, 4156, 4155, 4158, 4157, 4159, 4161, 4160, 4163, 4162, 4164, 4166, 4165, 4167, 4169, 4168, 4170, 4172, 4171, 4173, 4174, 4176, 4175, 4178, 4177, 4179, 4180, 4182, 4181, 4183, 4185, 4184, 4186, 4187, 4189, 4188, 4191, 4190, 4192, 4194, 4193, 4195, 4197, 4196, 4199, 4198, 4200, 4202, 4201, 4203, 4204, 4206, 4205, 4208, 4207, 4209, 4211, 4210, 4212, 4214, 4213, 4216, 4215, 4217, 4218, 4220, 4219, 4222, 4221, 4223, 4224, 4226, 4225, 4228, 4227, 4229, 4230, 4231, 4232, 4233, 4234, 4236, 4235, 4238, 4237, 4240, 4239, 4242, 4241, 4244, 4243, 4245, 4246, 4247, 4249, 4248, 4250, 4252, 4251, 4253, 4255, 4254, 4256, 4257, 4258, 4260, 4259, 4261, 4263, 4262, 4264, 4265, 4266, 4268, 4267, 4269, 4270, 4271, 4273, 4272, 4274, 4276, 4275, 4277, 4278, 4279, 4281, 4280, 4282, 4284, 4283, 4286, 4285, 4288, 4287, 4290, 4289, 4291, 4293, 4292, 4295, 4294, 4297, 4296, 4298, 4300, 4299, 4301, 4302, 4303, 4304, 4305, 4306, 4308, 4307, 4310, 4309, 4312, 4311, 4313, 4314, 4316, 4315, 4318, 4317, 4320, 4319, 4322, 4321, 4324, 4323, 4326, 4325, 4327, 4328, 4330, 4329, 4332, 4331, 4333, 4335, 4334, 4337, 4336, 4339, 4338, 4341, 4340, 4342, 4343, 4344, 4345, 4347, 4346, 4349, 4348, 4350, 4352, 4351, 4354, 4353, 4355, 4357, 4356, 4359, 4358, 4360, 4362, 4361, 4363, 4364, 4365, 4366, 4368, 4367, 4370, 4369, 4372, 4371, 4374, 4373, 4376, 4375, 4378, 4377, 4380, 4379, 4381, 4382, 4384, 4383, 4385, 4387, 4386, 4389, 4388, 4390, 4392, 4391, 4394, 4393, 4396, 4395, 4398, 4397, 4400, 4399, 4401, 4402, 4404, 4403, 4406, 4405, 4407, 4409, 4408, 4410, 4412, 4411, 4413, 4414, 4415, 4416, 4418, 4417, 4420, 4419, 4422, 4421, 4424, 4423, 4426, 4425, 4428, 4427, 4429, 4431, 4430, 4433, 4432, 4435, 4434, 4437, 4436, 4438, 4439, 4441, 4440, 4442, 4444, 4443, 4446, 4445, 4447, 4449, 4448, 4451, 4450, 4453, 4452, 4455, 4454, 4456, 4457, 4459, 4458, 4461, 4460, 4462, 4464, 4463, 4466, 4465, 4467, 4469, 4468, 4470, 4472, 4471, 4474, 4473, 4476, 4475, 4477, 4478, 4480, 4479, 4482, 4481, 4484, 4483, 4485, 4487, 4486, 4488, 4490, 4489, 4491, 4493, 4492, 4495, 4494, 4497, 4496, 4498, 4499, 4501, 4500, 4502, 4504, 4503, 4505, 4507, 4506, 4508, 4509, 4510, 4512, 4511, 4514, 4513, 4515, 4517, 4516, 4519, 4518, 4521, 4520, 4522, 4524, 4523, 4526, 4525, 4527, 4528, 4529, 4530, 4531, 4533, 4532, 4534, 4535, 4537, 4536, 4539, 4538, 4540, 4542, 4541, 4544, 4543, 4545, 4547, 4546, 4549, 4548, 4550, 4551, 4553, 4552, 4554, 4555, 4557, 4556, 4558, 4560, 4559, 4562, 4561, 4563, 4565, 4564, 4567, 4566, 4569, 4568, 4570, 4572, 4571, 4573, 4574, 4575, 4577, 4576, 4578, 4580, 4579, 4581, 4583, 4582, 4585, 4584, 4587, 4586, 4588, 4589, 4591, 4590, 4592, 4594, 4593, 4595, 4597, 4596, 4598, 4600, 4599, 4602, 4601, 4604, 4603, 4605, 4606, 4608, 4607, 4610, 4609, 4612, 4611, 4613, 4615, 4614, 4616, 4618, 4617, 4619, 4621, 4620, 4623, 4622, 4625, 4624, 4627, 4626, 4628, 4630, 4629, 4632, 4631, 4633, 4635, 4634, 4636, 4638, 4637, 4639, 4640, 4641, 4642, 4644, 4643, 4645, 4647, 4646, 4648, 4649, 4651, 4650, 4653, 4652, 4655, 4654, 4656, 4658, 4657, 4660, 4659, 4661, 4663, 4662, 4665, 4664, 4666, 4667, 4668, 4670, 4669, 4672, 4671, 4673, 4675, 4674, 4676, 4678, 4677, 4680, 4679, 4681, 4682, 4684, 4683, 4686, 4685, 4688, 4687, 4689, 4691, 4690, 4693, 4692, 4695, 4694, 4696, 4697, 4699, 4698, 4700, 4702, 4701, 4703, 4705, 4704, 4706, 4708, 4707, 4710, 4709, 4711, 4713, 4712, 4714, 4716, 4715, 4717, 4718, 4719, 4721, 4720, 4723, 4722, 4725, 4724, 4727, 4726, 4729, 4728, 4731, 4730, 4733, 4732, 4735, 4734, 4737, 4736, 4739, 4738, 4741, 4740, 4743, 4742, 4745, 4744, 4747, 4746, 4748, 4750, 4749, 4751, 4753, 4752, 4755, 4754, 4757, 4756, 4759, 4758, 4761, 4760, 4763, 4762, 4764, 4765, 4767, 4766, 4768, 4769, 4771, 4770, 4773, 4772, 4775, 4774, 4777, 4776, 4779, 4778, 4780, 4782, 4781, 4783, 4784, 4786, 4785, 4787, 4789, 4788, 4791, 4790, 4793, 4792, 4794, 4796, 4795, 4798, 4797, 4800, 4799, 4801, 4802, 4804, 4803, 4805, 4806, 4808, 4807, 4809, 4810, 4812, 4811, 4813, 4815, 4814, 4816, 4817, 4818, 4819, 4820, 4822, 4821, 4823, 4825, 4824, 4827, 4826, 4828, 4830, 4829, 4831, 4832, 4833, 4835, 4834, 4836, 4838, 4837, 4839, 4840, 4841, 4843, 4842, 4844, 4845, 4847, 4846, 4848, 4850, 4849, 4851, 4852, 4853, 4854, 4856, 4855, 4858, 4857, 4859, 4861, 4860, 4863, 4862, 4864, 4866, 4865, 4867, 4869, 4868, 4870, 4871, 4873, 4872, 4875, 4874, 4877, 4876, 4878, 4880, 4879, 4881, 4882, 4884, 4883, 4885, 4886, 4888, 4887, 4889, 4890, 4891, 4892, 4894, 4893, 4895, 4896, 4898, 4897, 4900, 4899, 4902, 4901, 4903, 4904, 4905, 4906, 4908, 4907, 4910, 4909, 4912, 4911, 4914, 4913, 4916, 4915, 4917, 4918, 4919, 4920, 4921, 4922, 4924, 4923, 4925, 4926, 4927, 4929, 4928, 4930, 4931, 4933, 4932, 4935, 4934, 4937, 4936, 4938, 4940, 4939, 4941, 4942, 4943, 4945, 4944, 4946, 4947, 4948, 4950, 4949, 4951, 4953, 4952, 4955, 4954, 4956, 4958, 4957, 4959, 4960, 4961, 4962, 4964, 4963, 4966, 4965, 4967, 4968, 4969, 4970, 4971, 4972, 4973, 4974, 4975, 4976, 4977, 4978, 4979, 4980, 4982, 4981, 4983, 4985, 4984, 4987, 4986, 4988, 4990, 4989, 4991, 4993, 4992, 4995, 4994, 4996, 4998, 4997, 4999};
        System.out.println(isIdealPermutation(A));
    }

    public static boolean isIdealPermutation(int[] A) {
        if (A == null || A.length < 2) {
            return true;
        }
        int max = 0;
        for (int i = 0; i < A.length - 2; i++) {
            max = Math.max(max, A[i]);
            if (max > A[i + 2]) return false;
        }
        return true;
    }
}
