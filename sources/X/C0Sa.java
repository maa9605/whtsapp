package X;

import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: X.0Sa  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Sa {
    public static final SparseArray A00;
    public static final SparseArray A01;
    public static final SparseArray A02;

    static {
        SparseArray sparseArray = new SparseArray(207);
        A01 = sparseArray;
        sparseArray.append(1, "ZZ");
        sparseArray.append(7, "ZZ");
        sparseArray.append(20, "EG");
        sparseArray.append(27, "ZA");
        sparseArray.append(30, "GR");
        sparseArray.append(31, "NL");
        sparseArray.append(32, "BE");
        sparseArray.append(33, "FR");
        sparseArray.append(34, "ES");
        sparseArray.append(36, "HU");
        sparseArray.append(39, "IT");
        sparseArray.append(40, "RO");
        sparseArray.append(41, "CH");
        sparseArray.append(43, "AT");
        sparseArray.append(44, "ZZ");
        sparseArray.append(45, "DK");
        sparseArray.append(46, "SE");
        sparseArray.append(47, "ZZ");
        sparseArray.append(48, "PL");
        sparseArray.append(49, "DE");
        sparseArray.append(51, "PE");
        sparseArray.append(52, "MX");
        sparseArray.append(53, "CU");
        sparseArray.append(54, "AR");
        sparseArray.append(55, "BR");
        sparseArray.append(56, "CL");
        sparseArray.append(57, "CO");
        sparseArray.append(58, "VE");
        sparseArray.append(60, "MY");
        sparseArray.append(61, "ZZ");
        sparseArray.append(62, "ID");
        sparseArray.append(63, "PH");
        sparseArray.append(64, "NZ");
        sparseArray.append(65, "SG");
        sparseArray.append(66, "TH");
        sparseArray.append(81, "JP");
        sparseArray.append(82, "KR");
        sparseArray.append(84, "VN");
        sparseArray.append(86, "CN");
        sparseArray.append(90, "TR");
        sparseArray.append(91, "IN");
        sparseArray.append(92, "PK");
        sparseArray.append(93, "AF");
        sparseArray.append(94, "LK");
        sparseArray.append(95, "MM");
        sparseArray.append(98, "IR");
        sparseArray.append(211, "SS");
        sparseArray.append(212, "MA");
        sparseArray.append(213, "DZ");
        sparseArray.append(216, "TN");
        sparseArray.append(218, "LY");
        sparseArray.append(220, "GM");
        sparseArray.append(221, "SN");
        sparseArray.append(222, "MR");
        sparseArray.append(223, "ML");
        sparseArray.append(224, "GN");
        sparseArray.append(225, "CI");
        sparseArray.append(226, "BF");
        sparseArray.append(227, "NE");
        sparseArray.append(228, "TG");
        sparseArray.append(229, "BJ");
        sparseArray.append(230, "MU");
        sparseArray.append(231, "LR");
        sparseArray.append(232, "SL");
        sparseArray.append(233, "GH");
        sparseArray.append(234, "NG");
        sparseArray.append(235, "TD");
        sparseArray.append(236, "CF");
        sparseArray.append(237, "CM");
        sparseArray.append(238, "CV");
        sparseArray.append(239, "ST");
        sparseArray.append(240, "GQ");
        sparseArray.append(241, "GA");
        sparseArray.append(242, "CG");
        sparseArray.append(243, "CD");
        sparseArray.append(244, "AO");
        sparseArray.append(245, "GW");
        sparseArray.append(246, "IO");
        sparseArray.append(247, "AC");
        sparseArray.append(248, "SC");
        sparseArray.append(249, "SD");
        sparseArray.append(250, "RW");
        sparseArray.append(251, "ET");
        sparseArray.append(252, "SO");
        sparseArray.append(253, "DJ");
        sparseArray.append(254, "KE");
        sparseArray.append(255, "TZ");
        sparseArray.append(256, "UG");
        sparseArray.append(257, "BI");
        sparseArray.append(258, "MZ");
        sparseArray.append(260, "ZM");
        sparseArray.append(261, "MG");
        sparseArray.append(262, "ZZ");
        sparseArray.append(263, "ZW");
        sparseArray.append(264, "NA");
        sparseArray.append(265, "MW");
        sparseArray.append(266, "LS");
        sparseArray.append(267, "BW");
        sparseArray.append(268, "SZ");
        sparseArray.append(269, "KM");
        sparseArray.append(290, "SH");
        sparseArray.append(291, "ER");
        sparseArray.append(297, "AW");
        sparseArray.append(298, "FO");
        sparseArray.append(299, "GL");
        sparseArray.append(350, "GI");
        sparseArray.append(351, "PT");
        sparseArray.append(352, "LU");
        sparseArray.append(353, "IE");
        sparseArray.append(354, "IS");
        sparseArray.append(355, "AL");
        sparseArray.append(356, "MT");
        sparseArray.append(357, "CY");
        sparseArray.append(358, "ZZ");
        sparseArray.append(359, "BG");
        sparseArray.append(370, "LT");
        sparseArray.append(371, "LV");
        sparseArray.append(372, "EE");
        sparseArray.append(373, "MD");
        sparseArray.append(374, "AM");
        sparseArray.append(375, "BY");
        sparseArray.append(376, "AD");
        sparseArray.append(377, "MC");
        sparseArray.append(378, "SM");
        sparseArray.append(379, "VA");
        sparseArray.append(380, "UA");
        sparseArray.append(381, "RS");
        sparseArray.append(382, "ME");
        sparseArray.append(383, "XK");
        sparseArray.append(385, "HR");
        sparseArray.append(386, "SI");
        sparseArray.append(387, "BA");
        sparseArray.append(389, "MK");
        sparseArray.append(420, "CZ");
        sparseArray.append(421, "SK");
        sparseArray.append(423, "LI");
        sparseArray.append(500, "FK");
        sparseArray.append(501, "BZ");
        sparseArray.append(502, "GT");
        sparseArray.append(503, "SV");
        sparseArray.append(504, "HN");
        sparseArray.append(505, "NI");
        sparseArray.append(506, "CR");
        sparseArray.append(507, "PA");
        sparseArray.append(508, "PM");
        sparseArray.append(509, "HT");
        sparseArray.append(590, "ZZ");
        sparseArray.append(591, "BO");
        sparseArray.append(592, "GY");
        sparseArray.append(593, "EC");
        sparseArray.append(594, "GF");
        sparseArray.append(595, "PY");
        sparseArray.append(596, "MQ");
        sparseArray.append(597, "SR");
        sparseArray.append(598, "UY");
        sparseArray.append(599, "ZZ");
        sparseArray.append(670, "TL");
        sparseArray.append(672, "NF");
        sparseArray.append(673, "BN");
        sparseArray.append(674, "NR");
        sparseArray.append(675, "PG");
        sparseArray.append(676, "TO");
        sparseArray.append(677, "SB");
        sparseArray.append(678, "VU");
        sparseArray.append(679, "FJ");
        sparseArray.append(680, "PW");
        sparseArray.append(681, "WF");
        sparseArray.append(682, "CK");
        sparseArray.append(683, "NU");
        sparseArray.append(685, "WS");
        sparseArray.append(686, "KI");
        sparseArray.append(687, "NC");
        sparseArray.append(688, "TV");
        sparseArray.append(689, "PF");
        sparseArray.append(690, "TK");
        sparseArray.append(691, "FM");
        sparseArray.append(692, "MH");
        sparseArray.append(850, "KP");
        sparseArray.append(852, "HK");
        sparseArray.append(853, "MO");
        sparseArray.append(855, "KH");
        sparseArray.append(856, "LA");
        sparseArray.append(880, "BD");
        sparseArray.append(886, "TW");
        sparseArray.append(960, "MV");
        sparseArray.append(961, "LB");
        sparseArray.append(962, "JO");
        sparseArray.append(963, "SY");
        sparseArray.append(964, "IQ");
        sparseArray.append(965, "KW");
        sparseArray.append(966, "SA");
        sparseArray.append(967, "YE");
        sparseArray.append(968, "OM");
        sparseArray.append(970, "PS");
        sparseArray.append(971, "AE");
        sparseArray.append(972, "IL");
        sparseArray.append(973, "BH");
        sparseArray.append(974, "QA");
        sparseArray.append(975, "BT");
        sparseArray.append(976, "MN");
        sparseArray.append(977, "NP");
        sparseArray.append(992, "TJ");
        sparseArray.append(993, "TM");
        sparseArray.append(994, "AZ");
        sparseArray.append(995, "GE");
        sparseArray.append(996, "KG");
        sparseArray.append(998, "UZ");
        A02 = new SparseArray(9);
        A00 = new SparseArray(9);
        A02.append(1, Arrays.asList(Pair.create("AG", "(?:268[2-9]\\d{6}|268(?:4(?:6[0-38]|84)|56[0-2])\\d{4})"), Pair.create("AI", "(?:264(?:235|476|5(?:3[6-9]|8[1-4])|7(?:29|72))\\d{4}|2644(?:6[12]|9[78])\\d{4})"), Pair.create("AS", "(?:684[2-9]\\d{6}|6846(?:22|33|44|55|77|88|9[19])\\d{4})"), Pair.create("BB", "(?:246[2-9]\\d{6}|246(?:2(?:2[78]|7[0-4])|4(?:1[024-6]|2\\d|3[2-9])|5(?:20|[34]\\d|54|7[1-3])|6(?:2\\d|38)|7(?:37|57)|9(?:1[89]|63))\\d{4})"), Pair.create("BM", "(?:441(?:[37]\\d|5[0-39])\\d{5}|441(?:2(?:02|23|61|[3479]\\d)|[46]\\d{2}|5(?:4\\d|60|89)|824)\\d{4})"), Pair.create("BS", "(?:242[2-9]\\d{6}|242(?:3(?:02|[236][1-9]|4[0-24-9]|5[0-68]|7[3467]|8[0-4]|9[2-467])|461|502|6(?:0[1-3]|12|7[67]|8[78]|9[89])|7(?:02|88))\\d{4})"), Pair.create("CA", "(?:(?:2(?:04|[23]6|[48]9|50)|3(?:06|43|6[57])|4(?:03|1[68]|3[178]|50)|5(?:06|1[49]|48|79|8[17])|6(?:0[04]|13|22|39|47|72)|7(?:0[59]|78|8[02])|8(?:[06]7|19|25|7[39])|90[25])[2-9]\\d{6}|500555\\d{4}|(?:2(?:04|[23]6|[48]9|50)|3(?:06|43|65)|4(?:03|1[68]|3[178]|50)|5(?:06|1[49]|48|79|8[17])|6(?:0[04]|13|22|39|47|72)|7(?:0[59]|78|8[02])|8(?:[06]7|19|25|73)|90[25])[2-9]\\d{6}|310\\d{4})"), Pair.create("DM", "(?:767[2-9]\\d{6}|767(?:2(?:55|66)|4(?:2[01]|4[0-25-9])|50[0-4]|70[1-3])\\d{4})"), Pair.create("DO", "(?:8[024]9[2-9]\\d{6}|8(?:[04]9[2-9]\\d{6}|29(?:2(?:[0-59]\\d|6[04-9]|7[0-27]|8[0237-9])|3(?:[0-35-9]\\d|4[7-9])|[45]\\d{2}|6(?:[0-27-9]\\d|[3-5][1-9]|6[0135-8])|7(?:0[013-9]|[1-37]\\d|4[1-35689]|5[1-4689]|6[1-57-9]|8[1-79]|9[1-8])|8(?:0[146-9]|1[0-48]|[248]\\d|3[1-79]|5[01589]|6[013-68]|7[124-8]|9[0-8])|9(?:[0-24]\\d|3[02-46-9]|5[0-79]|60|7[0169]|8[57-9]|9[02-9]))\\d{4}))"), Pair.create("GD", "(?:473[2-9]\\d{6}|473(?:2(?:3[0-2]|69)|3(?:2[89]|86)|4(?:[06]8|3[5-9]|4[0-49]|5[5-79]|68|73|90)|63[68]|7(?:58|84)|800|938)\\d{4})"), Pair.create("GU", "(?:671[2-9]\\d{6}|671(?:3(?:00|3[39]|4[349]|55|6[26])|4(?:56|7[1-9]|8[0236-9])|5(?:55|6[2-5]|88)|6(?:3[2-578]|4[24-9]|5[34]|78|8[235-9])|7(?:[079]7|2[0167]|3[45]|47|8[789])|8(?:[2-5789]8|6[48])|9(?:2[29]|6[79]|7[1279]|8[789]|9[78]))\\d{4})"), Pair.create("JM", "(?:876[2-9]\\d{6}|876(?:5(?:0[12]|1[0-468]|2[35]|63)|6(?:0[1-3579]|1[027-9]|[23]\\d|40|5[06]|6[2-589]|7[05]|8[04]|9[4-9])|7(?:0[2-689]|[1-6]\\d|8[056]|9[45])|9(?:0[1-8]|1[02378]|[2-8]\\d|9[2-468]))\\d{4})"), Pair.create("KN", "(?:869(?:5(?:5[6-8]|6[5-7])|66\\d|76[02-7])\\d{4}|869(?:2(?:29|36)|302|4(?:6[015-9]|70))\\d{4})"), Pair.create("KY", "(?:345(?:32[1-9]|5(?:1[67]|2[5-79]|4[6-9]|50|76)|649|9(?:1[67]|2[2-9]|3[689]))\\d{4}|345(?:2(?:22|44)|444|6(?:23|38|40)|7(?:4[35-79]|6[6-9]|77)|8(?:00|1[45]|25|[48]8)|9(?:14|4[035-9]))\\d{4})"), Pair.create("LC", "(?:758[2-9]\\d{6}|758(?:4(?:30|5\\d|6[2-9]|8[0-2])|57[0-2]|638)\\d{4})"), Pair.create("MP", "(?:670[2-9]\\d{6}|670(?:2(?:3[3-7]|56|8[5-8])|32[1238]|4(?:33|8[348])|5(?:32|55|88)|6(?:64|70|82)|78[589]|8[3-9]8|989)\\d{4})"), Pair.create("MS", "(?:66449[2-6]\\d{4}|66439[23]\\d{4}|664491\\d{4})"), Pair.create("PR", "(?:787|939)[2-9]\\d{6}"), Pair.create("SX", "(?:7215(?:1[02]|2\\d|5[034679]|8[014-8])\\d{4}|7215(?:4[2-8]|8[239]|9[056])\\d{4})"), Pair.create("TC", "(?:649(?:2(?:3[129]|4[1-7])|3(?:3[1-389]|4[1-8])|4[34][1-3])\\d{4}|649(?:712|9(?:4\\d|50))\\d{4})"), Pair.create("TT", "(?:868[2-9]\\d{6}|868(?:2(?:01|[23]\\d)|6(?:0[79]|1[02-8]|2[1-9]|[3-69]\\d|7[0-79])|82[124])\\d{4})"), Pair.create("US", "(?:2(?:0[1-35-9]|1[02-9]|2[03-589]|3[149]|4[08]|5[1-46]|6[0279]|7[0269]|8[13])|3(?:0[1-57-9]|1[02-9]|2[0135]|3[0-24679]|4[167]|5[12]|6[014]|8[056])|4(?:0[124-9]|1[02-579]|2[3-5]|3[0245]|4[0235]|58|6[39]|7[0589]|8[04])|5(?:0[1-57-9]|1[0235-8]|20|3[0149]|4[01]|5[19]|6[1-47]|7[013-5]|8[056])|6(?:0[1-35-9]|1[024-9]|2[03689]|3[016]|4[16]|5[017]|6[0-279]|78|8[0-29])|7(?:0[1-46-8]|1[02-9]|2[04-7]|3[1247]|4[037]|5[47]|6[02359]|7[02-59]|8[156])|8(?:0[1-68]|1[02-8]|2[08]|3[0-258]|4[3578]|5[046-9]|6[02-5]|7[028])|9(?:0[1346-9]|1[02-9]|2[0589]|3[014678]|4[0179]|5[12469]|7[0-3589]|8[04-69]))[2-9]\\d{6}"), Pair.create("VC", "(?:784[2-9]\\d{6}|784(?:266|3(?:6[6-9]|7\\d|8[0-24-6])|4(?:38|5[0-36-8]|8[0-8])|5(?:55|7[0-2]|93)|638|784)\\d{4})"), Pair.create("VG", "(?:284[2-9]\\d{6}|284(?:(?:229|4(?:22|9[45])|774|8(?:52|6[459]))\\d{4}|496[1-5]\\d{3}))"), Pair.create("VI", "(?:340[2-9]\\d{6}|340(?:2(?:01|2[0678]|44|77)|3(?:32|44)|4(?:2[23]|7[34])|5(?:1[34]|55)|6(?:26|4[23]|77|9[023])|7(?:1[2-57-9]|2[57]|7\\d)|884|998)\\d{4})")));
        A00.append(1, "US");
        A02.append(7, Arrays.asList(Pair.create("KZ", "(?:7(?:0[0-25-8]|47|6[02-4]|7[15-8]|85)\\d{7}|33622\\d{5}|7(?:1(?:0(?:[23]\\d|4[0-3]|59|63)|1(?:[23]\\d|4[0-79]|59)|2(?:[23]\\d|59)|3(?:2\\d|3[0-79]|4[0-35-9]|59)|4(?:[24]\\d|3[013-9]|5[1-9])|5(?:2\\d|3[1-9]|4[0-7]|59)|6(?:[234]\\d|5[19]|61)|72\\d|8(?:[27]\\d|3[1-46-9]|4[0-5]))|2(?:1(?:[23]\\d|4[46-9]|5[3469])|2(?:2\\d|3[0679]|46|5[12679])|3(?:[234]\\d|5[139])|4(?:2\\d|3[1235-9]|59)|5(?:[23]\\d|4[01246-8]|59|61)|6(?:2\\d|3[1-9]|4[0-4]|59)|7(?:[2379]\\d|40|5[279])|8(?:[23]\\d|4[0-3]|59)|9(?:2\\d|3[124578]|59)))\\d{5})"), Pair.create("RU", "(?:9\\d{9}|(?:3(?:0[12]|4[1-35-79]|5[1-3]|65|8[1-58]|9[0145])|4(?:01|1[1356]|2[13467]|7[1-5]|8[1-7]|9[1-689])|8(?:1[1-8]|2[01]|3[13-6]|4[0-8]|5[15]|6[1-35-79]|7[1-37-9]))\\d{7}|58\\d{7}|(?:3(?:0[12]|4[1-35-79]|5[1-3]|65|8[1-58]|9[0145])|4(?:01|1[1356]|2[13467]|7[1-5]|8[1-7]|9[1-689])|8(?:1[1-8]|2[01]|3[13-6]|4[0-8]|5[15]|6[1-35-79]|7[1-37-9]))\\d{7})")));
        A00.append(7, "RU");
        SparseArray sparseArray2 = A02;
        sparseArray2.append(44, Arrays.asList(Pair.create("GB", "(?:7(?:[1-3]\\d{3}|4(?:[0-46-9]\\d{2}|5(?:[0-689]\\d|7[0-57-9]))|5(?:0[0-8]|[13-9]\\d|2[0-35-9])\\d|7(?:0(?:0[01]|[1-9]\\d)|[1-7]\\d{2}|8[02-9]\\d|9[0-689]\\d)|8(?:[014-9]\\d|[23][0-8])\\d|9(?:[024-9]\\d{2}|1(?:[02-9]\\d|1[028])|3[0-689]\\d))\\d{5}|(?:1(?:1(?:3[0-58]|4[0-5]|5[0-26-9]|6[0-4]|[78][0-49])|2(?:0[024-9]|1[0-7]|2[3-9]|3[3-79]|4[1-689]|[58][02-9]|6[0-47-9]|7[013-9]|9\\d)|3(?:0\\d|1[0-8]|[25][02-9]|3[02-579]|[468][0-46-9]|7[1-35-79]|9[2-578])|4(?:0[03-9]|[137]\\d|[28][02-57-9]|4[02-69]|5[0-8]|[69][0-79])|5(?:0[1-35-9]|[16]\\d|2[024-9]|3[015689]|4[02-9]|5[03-9]|7[0-35-9]|8[0-468]|9[0-57-9])|6(?:0[034689]|1\\d|2[0-35689]|[38][013-9]|4[1-467]|5[0-69]|6[13-9]|7[0-8]|9[0-24578])|7(?:0[0246-9]|2\\d|3[0236-8]|4[03-9]|5[0-46-9]|6[013-9]|7[0-35-9]|8[024-9]|9[02-9])|8(?:0[35-9]|2[1-57-9]|3[02-578]|4[0-578]|5[124-9]|6[2-69]|7\\d|8[02-9]|9[02569])|9(?:0[02-589]|[18]\\d|2[02-689]|3[1-57-9]|4[2-9]|5[0-579]|6[2-47-9]|7[0-24578]|9[2-57]))|2(?:0[01378]|3[0189]|4[017]|8[0-46-9]|9[0-2])\\d)\\d{6}|1(?:(?:2(?:0(?:46[1-4]|87[2-9])|545[1-79]|76(?:2\\d|3[1-8]|6[1-6])|9(?:7(?:2[0-4]|3[2-5])|8(?:2[2-8]|7[0-47-9]|8[3-5])))|3(?:6(?:38[2-5]|47[23])|8(?:47[04-9]|64[0157-9]))|4(?:044[1-7]|20(?:2[23]|8\\d)|6(?:0(?:30|5[2-57]|6[1-8]|7[2-8])|140)|8(?:052|87[1-3]))|5(?:2(?:4(?:3[2-79]|6\\d)|76\\d)|6(?:26[06-9]|686))|6(?:06(?:4\\d|7[4-79])|295[5-7]|35[34]\\d|47(?:24|61)|59(?:5[08]|6[67]|74)|9(?:55[0-4]|77[23]))|8(?:27[56]\\d|37(?:5[2-5]|8[239])|843[2-58])|9(?:0(?:0(?:6[1-8]|85)|52\\d)|3583|4(?:66[1-8]|9(?:2[01]|81))|63(?:23|3[1-4])|9561))\\d|7(?:(?:26(?:6[13-9]|7[0-7])|442\\d|50(?:2[0-3]|[3-68]2|76))\\d|6888[2-46-8]))\\d\\d)"), Pair.create("GG", "(?:7(?:781\\d|839\\d|911[17])\\d{5}|1481\\d{6})"), Pair.create("IM", "(?:7(?:4576|[569]24\\d)\\d{5}|1624\\d{6})"), Pair.create("JE", "(?:7(?:509\\d|7(?:00[378]|97[7-9])|829\\d|937\\d)\\d{5}|1534\\d{6})")));
        A00.append(44, "GB");
        sparseArray2.append(47, Arrays.asList(Pair.create("NO", "(?:(?:4[015-8]|5[89]|87|9\\d)\\d{6}|(?:2[1-4]|3[1-3578]|5[1-35-7]|6[1-4679]|7[0-8])\\d{6})"), Pair.create("SJ", "79\\d{6}")));
        A00.append(47, "NO");
        SparseArray sparseArray3 = A02;
        sparseArray3.append(61, Arrays.asList(Pair.create("AU", "(?:483[0-3]\\d{5}|4(?:[0-3]\\d|4[047-9]|5[0-25-9]|6[06-9]|7[02-9]|8[0-2457-9]|9[0-27-9])\\d{6}|482\\d{6}|(?:[237]\\d{5}|8(?:[6-8]\\d{4}|9(?:[02-9]\\d{3}|1(?:6[0135-9]\\d|[0-57-9]\\d{2}))|51(?:0(?:0[03-9]|3[2-9]|5[0-8]|6[1-9]|8[0-6]|[1247]\\d)|1(?:1[69]|4[0-4]|[23]\\d))))\\d{3})"), Pair.create("CC", "89162\\d{4}"), Pair.create("CX", "89164\\d{4}")));
        A00.append(61, "AU");
        sparseArray3.append(262, Arrays.asList(Pair.create("RE", "(?:6(?:9[23]|47)\\d{6}|262\\d{6})"), Pair.create("YT", "(?:639\\d{6}|269(?:6[0-4]|50)\\d{4})")));
        A00.append(262, "RE");
        sparseArray3.append(358, Arrays.asList(Pair.create("AX", "18[1-8]\\d{3,9}"), Pair.create("FI", "(?:4\\d{5,10}|50\\d{4,8}|299\\d{6}|1(?:[3569][1-8]\\d{3,9}|[47]\\d{5,10})|2[1-8]\\d{3,9}|3(?:[1-8]\\d{3,9}|9\\d{4,8})|[5689][1-8]\\d{3,9})")));
        A00.append(358, "FI");
        sparseArray3.append(590, Arrays.asList(Pair.create("BL", "590(?:2[7-9]|5[12]|87)\\d{4}"), Pair.create("GP", "(?:690\\d{6}|590(?:0[13468]|1[012]|2[0-68]|3[28]|4[0-8]|5[579]|6[0189]|70|8[0-689]|9\\d)\\d{4})"), Pair.create("MF", "590(?:[02][79]|13|5[0-268]|[78]7)\\d{4}")));
        A00.append(590, "GP");
        sparseArray3.append(599, Arrays.asList(Pair.create("BQ", "(?:(?:31(?:8[14-8]|9[14578])|416[14-9]|7(?:0[01]|7[017]|8\\d|9[056])\\d)\\d{3}|(?:318[023]|41(?:6[023]|70)|7(?:1[578]|50)\\d)\\d{3})"), Pair.create("CW", "(?:9(?:5(?:[12467]\\d|3[01])|6(?:[15-9]\\d|3[01]))\\d{4}|9(?:[48]\\d{2}|50\\d|7(?:2[0-24]|[34]\\d|6[35-7]|77|8[7-9]))\\d{4})")));
        A00.append(599, "CW");
    }
}
