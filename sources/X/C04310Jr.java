package X;

import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Jr */
/* loaded from: classes.dex */
public class C04310Jr {
    public static final Pattern A00 = Pattern.compile("(?:((?:\\b|^|(?<=_))(?:(?:(?:(?i:http|https|rtsp|ftp)://(?:(?:[a-zA-Z0-9$\\-_.+!*'(),;?&=]|(?:%[a-fA-F0-9]{2})){1,64}(?::(?:[a-zA-Z0-9$\\-_.+!*'(),;?&=]|(?:%[a-fA-F0-9]{2})){1,25})?@)?)|(?i:www\\.))(?:((?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]\\-]{0,61}[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+)(xn--[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63}))(?::\\d{1,5})?)(?:[/?#](?:(?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/?:@&=#~$|\\[\\]\\-.+!*'(),_])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|(?=_)))|((?:\\b|^|(?<=_))(?<!://)(?:(?:((?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]\\-]{0,61}[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+)(xn--[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63}))(?::\\d{1,5})?)(?:[/?#](?:(?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/?:@&=#~$|\\[\\]\\-.+!*'(),_])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|(?=_))))");
    public static final Pattern A01 = Pattern.compile("((?:\\b|^|(?<=_))(?:(?:(?:(?i:http|https|rtsp|ftp)://(?:(?:[a-zA-Z0-9$\\-_.+!*'(),;?&=]|(?:%[a-fA-F0-9]{2})){1,64}(?::(?:[a-zA-Z0-9$\\-_.+!*'(),;?&=]|(?:%[a-fA-F0-9]{2})){1,25})?@)?)|(?i:www\\.))(?:((?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]\\-]{0,61}[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+)(xn--[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63}))(?::\\d{1,5})?)(?:[/?#](?:(?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/?:@&=#~$|\\[\\]\\-.+!*'(),_])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|(?=_)))");
    public static final Pattern A02 = Pattern.compile("(?:(?:(?:aaa|aarp|abb|abbott|abogado|academy|accenture|accountant|accountants|aco|active|actor|ads|adult|aeg|aero|afl|agency|aig|airforce|airtel|allfinanz|alsace|amica|amsterdam|android|apartments|app|apple|aquarelle|aramco|archi|army|arpa|arte|asia|associates|attorney|auction|audio|auto|autos|axa|azure|a[cdefgilmoqrstuwxz])|(?:band|bank|bar|barcelona|barclaycard|barclays|bargains|bauhaus|bayern|bbc|bbva|bcn|beats|beer|bentley|berlin|best|bet|bharti|bible|bid|bike|bing|bingo|bio|biz|black|blackfriday|bloomberg|blue|bms|bmw|bnl|bnpparibas|boats|bom|bond|boo|boots|boutique|bradesco|bridgestone|broadway|broker|brother|brussels|budapest|build|builders|business|buzz|bzh|b[abdefghijmnorstvwyz])|(?:cab|cafe|cal|camera|camp|cancerresearch|canon|capetown|capital|car|caravan|cards|care|career|careers|cars|cartier|casa|cash|casino|cat|catering|cba|cbn|ceb|center|ceo|cern|cfa|cfd|chanel|channel|chat|cheap|chloe|christmas|chrome|church|cipriani|cisco|citic|city|cityeats|claims|cleaning|click|clinic|clothing|cloud|club|clubmed|coach|codes|coffee|college|cologne|com|commbank|community|company|computer|comsec|condos|construction|consulting|contractors|cooking|cool|coop|corsica|country|coupons|courses|credit|creditcard|creditunion|cricket|crown|crs|cruises|csc|cuisinella|cymru|cyou|c[acdfghiklmnoruvwxyz])|(?:dabur|dad|dance|date|dating|datsun|day|dclk|deals|degree|delivery|dell|delta|democrat|dental|dentist|desi|design|dev|diamonds|diet|digital|direct|directory|discount|dnp|docs|dog|doha|domains|doosan|download|drive|durban|dvag|d[ejkmoz])|(?:earth|eat|edu|education|email|emerck|energy|engineer|engineering|enterprises|epson|equipment|erni|esq|estate|eurovision|eus|events|everbank|exchange|expert|exposed|express|e[cegrstu])|(?:fage|fail|fairwinds|faith|family|fan|fans|farm|fashion|feedback|ferrero|film|final|finance|financial|firmdale|fish|fishing|fit|fitness|flights|florist|flowers|flsmidth|fly|foo|football|forex|forsale|forum|foundation|frl|frogans|fund|furniture|futbol|fyi|f[ijkmor])|(?:gal|gallery|game|garden|gbiz|gdn|gea|gent|genting|ggee|gift|gifts|gives|giving|glass|gle|global|globo|gmail|gmo|gmx|gold|goldpoint|golf|goo|goog|google|gop|gov|grainger|graphics|gratis|green|gripe|group|gucci|guge|guide|guitars|guru|g[abdefghilmnpqrstuwy])|(?:hamburg|hangout|haus|healthcare|help|here|hermes|hiphop|hitachi|hiv|hockey|holdings|holiday|homedepot|homes|honda|horse|host|hosting|hoteles|hotmail|house|how|hsbc|hyundai|h[kmnrtu])|(?:ibm|icbc|ice|icu|ifm|iinet|immo|immobilien|industries|infiniti|info|ing|ink|institute|insure|int|international|investments|ipiranga|irish|ist|istanbul|itau|iwc|i[delmnoqrst])|(?:jaguar|java|jcb|jetzt|jewelry|jlc|jll|jobs|joburg|jprs|juegos|j[emop])|(?:kaufen|kddi|kia|kim|kinder|kitchen|kiwi|koeln|komatsu|krd|kred|kyoto|k[eghimnprwyz])|(?:lacaixa|lancaster|land|landrover|lasalle|lat|latrobe|law|lawyer|lds|lease|leclerc|legal|lexus|lgbt|liaison|lidl|life|lifestyle|lighting|limited|limo|linde|link|live|lixil|loan|loans|lol|london|lotte|lotto|love|ltd|ltda|lupin|luxe|luxury|l[abcikrstuvy])|(?:madrid|maif|maison|man|management|mango|market|marketing|markets|marriott|mba|media|meet|melbourne|meme|memorial|men|menu|meo|miami|microsoft|mil|mini|mma|mobi|moda|moe|moi|mom|monash|money|montblanc|mormon|mortgage|moscow|motorcycles|mov|movie|movistar|mtn|mtpc|mtr|museum|mutuelle|m[acdeghklmnopqrstuvwxyz])|(?:nadex|nagoya|name|navy|nec|net|netbank|network|neustar|new|news|nexus|ngo|nhk|nico|ninja|nissan|nokia|nra|nrw|ntt|nyc|n[acefgilopruz])|(?:obi|office|okinawa|omega|one|ong|onl|online|ooo|oracle|orange|org|organic|osaka|otsuka|ovh|om)|(?:page|panerai|paris|partners|parts|party|pet|pharmacy|philips|photo|photography|photos|physio|piaget|pics|pictet|pictures|ping|pink|pizza|place|play|playstation|plumbing|plus|pohl|poker|porn|post|praxi|press|pro|prod|productions|prof|properties|property|protection|pub|p[aefghklmnrstwy])|(?:qpon|quebec|qa)|(?:racing|realtor|realty|recipes|red|redstone|rehab|reise|reisen|reit|ren|rent|rentals|repair|report|republican|rest|restaurant|review|reviews|rich|ricoh|rio|rip|rocher|rocks|rodeo|rsvp|ruhr|run|rwe|ryukyu|r[eosuw])|(?:saarland|sakura|sale|samsung|sandvik|sandvikcoromant|sanofi|sap|sapo|sarl|saxo|sbs|sca|scb|schmidt|scholarships|school|schule|schwarz|science|scor|scot|seat|security|seek|sener|services|seven|sew|sex|sexy|shiksha|shoes|show|shriram|singles|site|ski|sky|skype|sncf|soccer|social|software|sohu|solar|solutions|sony|soy|space|spiegel|spreadbetting|srl|stada|starhub|statoil|stc|stcgroup|stockholm|studio|study|style|sucks|supplies|supply|support|surf|surgery|suzuki|swatch|swiss|sydney|systems|s[abcdeghijklmnortuvxyz])|(?:tab|taipei|tatamotors|tatar|tattoo|tax|taxi|team|tech|technology|tel|telefonica|temasek|tennis|thd|theater|theatre|tickets|tienda|tips|tires|tirol|today|tokyo|tools|top|toray|toshiba|tours|town|toyota|toys|trade|trading|training|travel|trust|tui|t[cdfghjklmnortvwz])|(?:ubs|university|uno|uol|u[agksyz])|(?:vacations|vana|vegas|ventures|versicherung|vet|viajes|video|villas|vin|virgin|vision|vista|vistaprint|viva|vlaanderen|vodka|vote|voting|voto|voyage|v[aceginu])|(?:wales|walter|wang|watch|webcam|website|wed|wedding|weir|whoswho|wien|wiki|williamhill|win|windows|wine|wme|work|works|world|wtc|wtf|w[fs])|(?:ελ|бел|дети|ком|мкд|мон|москва|онлайн|орг|рус|рф|сайт|срб|укр|қаз|հայ|קום|ارامكو|الاردن|الجزائر|السعودية|المغرب|امارات|ایران|بازار|بھارت|تونس|سودان|سورية|شبكة|عراق|عمان|فلسطين|قطر|كوم|مصر|مليسيا|موقع|कॉम|नेट|भारत|संगठन|ভারত|ਭਾਰਤ|ભારત|இந்தியா|இலங்கை|சிங்கப்பூர்|భారత్|ලංකා|คอม|ไทย|გე|みんな|グーグル|コム|世界|中信|中国|中國|中文网|企业|佛山|信息|健康|八卦|公司|公益|台湾|台灣|商城|商店|商标|在线|大拿|娱乐|工行|广东|慈善|我爱你|手机|政务|政府|新加坡|新闻|时尚|机构|淡马锡|游戏|点看|移动|组织机构|网址|网店|网络|谷歌|集团|飞利浦|餐厅|香港|닷넷|닷컴|삼성|한국|xbox|xerox|xin|xn--11b4c3d|xn--1qqw23a|xn--30rr7y|xn--3bst00m|xn--3ds443g|xn--3e0b707e|xn--3pxu8k|xn--42c2d9a|xn--45brj9c|xn--45q11c|xn--4gbrim|xn--55qw42g|xn--55qx5d|xn--6frz82g|xn--6qq986b3xl|xn--80adxhks|xn--80ao21a|xn--80asehdb|xn--80aswg|xn--90a3ac|xn--90ais|xn--9dbq2a|xn--9et52u|xn--b4w605ferd|xn--c1avg|xn--c2br7g|xn--cg4bki|xn--clchc0ea0b2g2a9gcd|xn--czr694b|xn--czrs0t|xn--czru2d|xn--d1acj3b|xn--d1alf|xn--efvy88h|xn--estv75g|xn--fhbei|xn--fiq228c5hs|xn--fiq64b|xn--fiqs8s|xn--fiqz9s|xn--fjq720a|xn--flw351e|xn--fpcrj9c3d|xn--fzc2c9e2c|xn--gecrj9c|xn--h2brj9c|xn--hxt814e|xn--i1b6b1a6a2e|xn--imr513n|xn--io0a7i|xn--j1aef|xn--j1amh|xn--j6w193g|xn--kcrx77d1x4a|xn--kprw13d|xn--kpry57d|xn--kput3i|xn--l1acc|xn--lgbbat1ad8j|xn--mgb9awbf|xn--mgba3a3ejt|xn--mgba3a4f16a|xn--mgbaam7a8h|xn--mgbab2bd|xn--mgbayh7gpa|xn--mgbbh1a71e|xn--mgbc0a9azcg|xn--mgberp4a5d4ar|xn--mgbpl2fh|xn--mgbtx2b|xn--mgbx4cd0ab|xn--mk1bu44c|xn--mxtq1m|xn--ngbc5azd|xn--node|xn--nqv7f|xn--nqv7fs00ema|xn--nyqy26a|xn--o3cw4h|xn--ogbpf8fl|xn--p1acf|xn--p1ai|xn--pgbs0dh|xn--pssy2u|xn--q9jyb4c|xn--qcka1pmc|xn--qxam|xn--rhqv96g|xn--s9brj9c|xn--ses554g|xn--t60b56a|xn--tckwe|xn--unup4y|xn--vermgensberater-ctb|xn--vermgensberatung-pwb|xn--vhquv|xn--vuq861b|xn--wgbh1c|xn--wgbl6a|xn--xhq521b|xn--xkc2al3hye2a|xn--xkc2dl3a5ee0h|xn--y9a3aq|xn--yfro4i67o|xn--ygbi2ammx|xn--zfr164b|xperia|xxx|xyz)|(?:yachts|yamaxun|yandex|yodobashi|yoga|yokohama|youtube|y[et])|(?:zara|zip|zone|zuerich|z[amw]))|xn--[\\w\\-]{0,58}\\w)");
    public static final String[] A03 = {"http://", "https://", "rtsp://", "ftp://"};

    public static Pair A00(CharSequence charSequence, int i, int i2) {
        if (i == 0 || charSequence.charAt(i - 1) != '@') {
            if (charSequence.length() <= i2 || charSequence.charAt(i2) != '/') {
                while (true) {
                    int i3 = i2 - 1;
                    if (".,!?".indexOf(charSequence.charAt(i3)) == -1) {
                        break;
                    }
                    i2 = i3;
                }
            } else {
                i2++;
            }
            return C41021tF.A00(charSequence, new Pair(Integer.valueOf(i), Integer.valueOf(i2)), C41021tF.A01);
        }
        return null;
    }

    public static String A01(String str) {
        String A022 = A02(str);
        if (A022 != null) {
            return A03(A022, A03);
        }
        return null;
    }

    public static String A02(String str) {
        ArrayList A05 = A05(str, true);
        if (A05 != null) {
            return (String) A05.get(0);
        }
        return null;
    }

    public static String A03(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                int length = str2.length();
                if (str.regionMatches(false, 0, str2, 0, length)) {
                    return str;
                }
                StringBuilder A0P = C000200d.A0P(str2);
                A0P.append(str.substring(length));
                return A0P.toString();
            }
        }
        return C000200d.A0L(new StringBuilder(), strArr[0], str);
    }

    public static ArrayList A04(String str) {
        ArrayList A05 = A05(str, false);
        if (A05 != null) {
            ArrayList arrayList = new ArrayList(A05.size());
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                String A032 = A03((String) it.next(), A03);
                if (!arrayList.contains(A032)) {
                    arrayList.add(A032);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x001b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A05(java.lang.String r12, boolean r13) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r4 = 0
            if (r0 == 0) goto L8
            return r4
        L8:
            java.util.regex.Pattern r2 = X.C04310Jr.A01
            int r1 = r12.length()
            r0 = 4096(0x1000, float:5.74E-42)
            r8 = 0
            if (r1 <= r0) goto L71
            java.lang.String r0 = r12.substring(r8, r0)
        L17:
            java.util.regex.Matcher r5 = r2.matcher(r0)
        L1b:
            boolean r0 = r5.find()
            if (r0 == 0) goto L73
            int r1 = r5.start()
            int r0 = r5.end()
            android.util.Pair r2 = A00(r12, r1, r0)
            if (r2 == 0) goto L1b
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r6 = r12.substring(r1, r0)
            java.lang.String[] r3 = X.C04310Jr.A03
            int r2 = r3.length
            r1 = 0
        L47:
            if (r1 >= r2) goto L1b
            r9 = r3[r1]
            r7 = 1
            int r11 = r9.length()
            r10 = r8
            boolean r0 = r6.regionMatches(r7, r8, r9, r10, r11)
            if (r0 == 0) goto L6e
            if (r4 != 0) goto L64
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r6)
            if (r13 == 0) goto L1b
            return r4
        L64:
            boolean r0 = r4.contains(r6)
            if (r0 != 0) goto L1b
            r4.add(r6)
            goto L1b
        L6e:
            int r1 = r1 + 1
            goto L47
        L71:
            r0 = r12
            goto L17
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04310Jr.A05(java.lang.String, boolean):java.util.ArrayList");
    }

    public static void A06(Spannable spannable) {
        CharSequence charSequence;
        Pattern pattern = A00;
        if (spannable.length() > 4096) {
            charSequence = spannable.subSequence(0, 4096);
        } else {
            charSequence = spannable;
        }
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            String group = matcher.group(5);
            String group2 = matcher.group(6);
            if (TextUtils.isEmpty(group) || TextUtils.isEmpty(group2) || A02.matcher(group2).matches()) {
                Pair A002 = A00(spannable, matcher.start(), matcher.end());
                if (A002 != null) {
                    String A032 = A03(spannable.subSequence(((Number) A002.first).intValue(), ((Number) A002.second).intValue()).toString(), A03);
                    spannable.setSpan(new URLSpan(A032), ((Number) A002.first).intValue(), ((Number) A002.second).intValue(), 33);
                }
            }
        }
    }
}
