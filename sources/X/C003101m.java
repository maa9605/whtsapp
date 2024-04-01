package X;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.01m */
/* loaded from: classes.dex */
public class C003101m {
    public static int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    return 3;
                }
            } else if (str.equals("low")) {
                return 2;
            }
        } else if (str.equals("unknown")) {
            return 1;
        }
        return 0;
    }

    public static Message A01(String str, AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2, String str2, C010805j c010805j, int i) {
        Message obtain = Message.obtain(null, 0, 188, 0, c010805j);
        obtain.getData().putString("id", str);
        obtain.getData().putParcelable("jid", abstractC005302j);
        obtain.getData().putParcelable("contextJid", abstractC005302j2);
        obtain.getData().putString("msgId", str2);
        obtain.getData().putInt("retryCount", i);
        return obtain;
    }

    public static Message A02(byte[] bArr, byte[] bArr2, Runnable runnable) {
        return Message.obtain(null, 0, 74, 0, new C010905k(bArr, bArr2, runnable));
    }

    public static Pair A03(String str) {
        int lastIndexOf = str.lastIndexOf(95);
        if (lastIndexOf == -1) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
            String substring = str.substring(0, lastIndexOf);
            if (TextUtils.isEmpty(substring)) {
                return null;
            }
            return new Pair(substring, Integer.valueOf(parseInt));
        } catch (Exception unused) {
            return null;
        }
    }

    public static AbstractC005302j A04(Jid jid) {
        if (jid instanceof DeviceJid) {
            return ((DeviceJid) jid).userJid;
        }
        return AbstractC005302j.A00(jid);
    }

    public static C011005l A05(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        Jid nullable = Jid.getNullable(obj);
        if (nullable instanceof C011005l) {
            return (C011005l) nullable;
        }
        throw new C011305p(obj);
    }

    public static UserJid A06(String str) {
        C011405q c011405q = C011405q.A00;
        return ("".equals(str) || c011405q.getRawString().equals(str)) ? c011405q : UserJid.getNullable(str);
    }

    public static String A07(Jid jid) {
        if (jid == null) {
            return null;
        }
        return jid.getRawString();
    }

    public static String A08(File file, Date date, String str) {
        String A0D = A0D(file.getName(), date);
        String A0C = A0C(file.getName(), str);
        File[] listFiles = file.getParentFile().listFiles();
        File file2 = null;
        if (listFiles != null) {
            int i = 0;
            for (File file3 : listFiles) {
                String name = file3.getName();
                if (name.startsWith(A0D) && name.endsWith(A0C)) {
                    int length = A0D.length() + 1;
                    int length2 = name.length();
                    int length3 = length2 - A0C.length();
                    if (length3 < length2 && length < length3) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(length, length3));
                            if (parseInt > i) {
                                file2 = file3;
                                i = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (file2 != null) {
            return file2.getName();
        }
        return C000200d.A0I(A0D, ".1", A0C);
    }

    public static String A09(String str) {
        return A0D(str, new Date()).substring(0, str.indexOf(46) + 1);
    }

    public static String A0A(String str) {
        Jid nullable = Jid.getNullable(str);
        return (nullable == null || !Jid.class.isAssignableFrom(nullable.getClass())) ? str : nullable.getObfuscatedString();
    }

    public static String A0B(String str) {
        Pair A03 = A03(str);
        if (A03 != null) {
            return (String) A03.first;
        }
        return null;
    }

    public static String A0C(String str, String str2) {
        return C000200d.A0H(str.substring(str.indexOf(46)), str2);
    }

    public static String A0D(String str, Date date) {
        StringBuilder A0V = C000200d.A0V(str.substring(0, str.indexOf(46)), "-");
        A0V.append(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date));
        return A0V.toString();
    }

    public static ArrayList A0E(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        A0N(collection, arrayList);
        return arrayList;
    }

    public static List A0F(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return arrayList;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Jid nullable = Jid.getNullable((String) it.next());
            if (cls.isInstance(nullable)) {
                arrayList.add(cls.cast(nullable));
            }
        }
        return arrayList;
    }

    public static List A0G(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                Jid nullable = Jid.getNullable(str);
                if (UserJid.class.isInstance(nullable)) {
                    arrayList.add(UserJid.class.cast(nullable));
                }
            }
        }
        return arrayList;
    }

    public static Locale A0H(Configuration configuration) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        if (locale == null) {
            Locale locale2 = Locale.getDefault();
            return locale2 == null ? Locale.US : locale2;
        }
        return locale;
    }

    public static Set A0I(AbstractC000600i abstractC000600i, Set set) {
        HashSet hashSet = new HashSet(set.size());
        A0K(abstractC000600i, set, hashSet);
        return hashSet;
    }

    public static void A0J(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Map map, boolean z) {
        SharedPreferences.Editor editor = null;
        SharedPreferences.Editor editor2 = null;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (sharedPreferences.contains(str)) {
                if (!z || !sharedPreferences2.contains(str)) {
                    if (editor == null) {
                        editor = sharedPreferences2.edit();
                    }
                    Class cls = (Class) entry.getValue();
                    if (cls == Boolean.class) {
                        editor.putBoolean(str, sharedPreferences.getBoolean(str, false));
                    } else if (cls == Integer.class) {
                        editor.putInt(str, sharedPreferences.getInt(str, 0));
                    } else if (cls == Float.class) {
                        editor.putFloat(str, sharedPreferences.getFloat(str, 0.0f));
                    } else if (cls == Long.class) {
                        editor.putLong(str, sharedPreferences.getLong(str, 0L));
                    } else if (cls == String.class) {
                        editor.putString(str, sharedPreferences.getString(str, null));
                    } else if (Set.class.isAssignableFrom(cls)) {
                        editor.putStringSet(str, sharedPreferences.getStringSet(str, null));
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot access value of type ");
                        sb.append(cls);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (editor2 == null) {
                    editor2 = sharedPreferences.edit();
                }
                editor2.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public static void A0K(AbstractC000600i abstractC000600i, Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid == null) {
                abstractC000600i.A09("Jids/deviceJidsToUserJids/null-jid", null, true);
            } else {
                collection.add(deviceJid.userJid);
            }
        }
    }

    public static void A0L(C006202t c006202t, String str) {
        c006202t.A03(2141, str, 0);
        c006202t.A03(2141, str, 1);
    }

    public static void A0M(Class cls, Collection collection, Collection collection2) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Jid nullable = Jid.getNullable((String) it.next());
            if (cls.isInstance(nullable)) {
                collection2.add(cls.cast(nullable));
            }
        }
    }

    public static void A0N(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (jid != null) {
                collection.add(jid.getRawString());
            }
        }
    }

    public static boolean A0O(Jid jid) {
        int type;
        return jid != null && ((type = jid.getType()) == 0 || type == 1 || type == 3 || type == 7) && !A0Y(jid);
    }

    public static boolean A0P(Jid jid) {
        if (jid != null) {
            int type = jid.getType();
            return type == 3 || type == 6 || type == 5;
        }
        return false;
    }

    public static boolean A0Q(Jid jid) {
        return jid != null && jid.getType() == 3;
    }

    public static boolean A0R(Jid jid) {
        if (jid != null) {
            int type = jid.getType();
            return type == 10 || type == 0 || type == 17;
        }
        return false;
    }

    public static boolean A0S(Jid jid) {
        return jid != null && C02M.A03.contains(jid.user);
    }

    public static boolean A0T(Jid jid) {
        return jid != null && jid.getType() == 9;
    }

    public static boolean A0U(Jid jid) {
        if (jid != null) {
            int type = jid.getType();
            return type == 1 || type == 2;
        }
        return false;
    }

    public static boolean A0V(Jid jid) {
        return jid != null && jid.getType() == 1;
    }

    public static boolean A0W(Jid jid) {
        return jid != null && jid.isProtocolCompliant();
    }

    public static boolean A0X(Jid jid) {
        if (jid != null) {
            int type = jid.getType();
            return type == 8 || type == 7;
        }
        return false;
    }

    public static boolean A0Y(Jid jid) {
        return jid != null && jid.getType() == 7;
    }

    public static boolean A0Z(Jid jid) {
        return jid != null && jid.getType() == 5;
    }

    public static boolean A0a(Jid jid) {
        return jid != null && jid.getType() == 2;
    }

    public static boolean A0b(Jid jid) {
        return jid != null && jid.getType() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A0c(File file, int i, String str, boolean z, boolean z2) {
        String str2;
        int length;
        int length2;
        file.getAbsolutePath();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String A0C = A0C(file.getName(), str);
        String A09 = A09(file.getName());
        int i2 = 0;
        if (i < 0) {
            int indexOf = file.getName().indexOf(46);
            if (indexOf == -1) {
                return true;
            }
            str2 = file.getName().substring(0, indexOf);
        } else {
            str2 = null;
        }
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int length3 = listFiles.length;
            int i3 = 0;
            while (i2 < length3) {
                File file2 = listFiles[i2];
                String name = file2.getName();
                if (i < 0) {
                    if (name.startsWith(str2)) {
                        try {
                            if (!file2.delete()) {
                                i3 = 1;
                            }
                        } catch (SecurityException | ParseException unused) {
                        }
                    }
                } else if (name.startsWith(A09) && name.endsWith(A0C) && (length2 = pattern.length() + (length = A09.length())) <= name.length()) {
                    long time = (date.getTime() - simpleDateFormat.parse(name.substring(length, length2)).getTime()) / TimeUnit.DAYS.toMillis(1L);
                    if (z) {
                        time = Math.abs(time);
                    }
                    if (time <= i && !z2) {
                        file2.getAbsolutePath();
                    } else {
                        file2.getAbsolutePath();
                        if (!file2.delete()) {
                            i3 = 1;
                        }
                    }
                }
                i2++;
            }
            i2 = i3;
        }
        return 1 ^ i2;
    }

    public static String[] A0d(Collection collection) {
        return (String[]) A0E(collection).toArray(new String[0]);
    }
}
