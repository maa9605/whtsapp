package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.3Bq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC66593Bq extends C0HS {
    public CharSequence A00;
    public String A01;
    public final /* synthetic */ C2MQ A02;

    public AbstractC66593Bq(C2MQ c2mq, CharSequence charSequence, String str) {
        this.A02 = c2mq;
        this.A00 = charSequence;
        this.A01 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        String obj;
        String A0D;
        String str;
        C0FK A01;
        Object obj2;
        int i;
        String A04;
        C2MQ c2mq = this.A02;
        C50212Qr c50212Qr = c2mq.A04;
        InputMethodManager A0I = c50212Qr.A02.A0I();
        if (A0I != null) {
            InputMethodSubtype currentInputMethodSubtype = A0I.getCurrentInputMethodSubtype();
            Locale locale = null;
            if (currentInputMethodSubtype != null && currentInputMethodSubtype.getMode().equals("keyboard")) {
                InputMethodSubtype inputMethodSubtype = c50212Qr.A00;
                if (inputMethodSubtype != null && inputMethodSubtype != currentInputMethodSubtype && !inputMethodSubtype.equals(currentInputMethodSubtype)) {
                    c50212Qr.A00();
                }
                c50212Qr.A00 = currentInputMethodSubtype;
                if (c50212Qr.A01 == null) {
                    c50212Qr.A00();
                }
                Set set = c50212Qr.A01;
                if (set != null && set.contains(currentInputMethodSubtype)) {
                    String locale2 = currentInputMethodSubtype.getLocale();
                    if (!TextUtils.isEmpty(locale2)) {
                        if (Pattern.matches("[a-z]{2}_[A-Z]{2}", locale2)) {
                            String replace = locale2.replace("_", "-");
                            if (Build.VERSION.SDK_INT >= 21) {
                                locale = Locale.forLanguageTag(replace);
                            } else {
                                locale = new Locale(locale2.substring(0, 2), locale2.substring(3, 5));
                            }
                        } else if (Pattern.matches("[a-z]{2}", locale2)) {
                            locale = new Locale(locale2);
                        } else {
                            C000200d.A13("keyboardLanguageExtractor/error/cannot parse locale ", locale2);
                        }
                    }
                }
            }
            CharSequence charSequence = this.A00;
            String str2 = this.A01;
            if (!(this instanceof C68473Ka)) {
                String[] strArr = new String[8];
                strArr[0] = "api_key";
                strArr[1] = C0FH.A0C;
                strArr[2] = "q";
                strArr[3] = charSequence.toString();
                strArr[4] = "lang";
                C53712hO c53712hO = ((C3KZ) this).A00.A00;
                if (c53712hO != null) {
                    if (locale != null && !TextUtils.isEmpty(locale.getLanguage())) {
                        if (locale.getLanguage().equalsIgnoreCase("zh") && !TextUtils.isEmpty(locale.getCountry())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(locale.getLanguage());
                            sb.append("-");
                            sb.append(locale.getCountry());
                            A04 = sb.toString();
                        } else {
                            A04 = locale.getLanguage();
                        }
                    } else {
                        A04 = c53712hO.A03.A04();
                    }
                    strArr[5] = A04;
                    strArr[6] = "rating";
                    strArr[7] = "pg-13";
                    A0D = C40061rW.A0D("https://api.giphy.com/v1/gifs/search", strArr);
                    if (!TextUtils.isEmpty(str2)) {
                        A0D = C40061rW.A0D(A0D, "offset", str2);
                    }
                } else {
                    throw null;
                }
            } else {
                String[] strArr2 = new String[6];
                strArr2[0] = "key";
                strArr2[1] = C0FH.A0K;
                strArr2[2] = "tag";
                strArr2[3] = charSequence.toString();
                strArr2[4] = "locale";
                C53702hN c53702hN = ((C68473Ka) this).A00.A00;
                if (c53702hN != null) {
                    if (locale != null) {
                        if (TextUtils.isEmpty(locale.getCountry())) {
                            obj = locale.getLanguage();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(locale.getLanguage());
                            sb2.append("_");
                            sb2.append(locale.getCountry());
                            obj = sb2.toString();
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        C002301c c002301c = c53702hN.A03;
                        sb3.append(c002301c.A04());
                        sb3.append("_");
                        sb3.append(c002301c.A03());
                        obj = sb3.toString();
                    }
                    strArr2[5] = obj;
                    A0D = C40061rW.A0D("https://wa.tenor.co/v1/search", strArr2);
                    if (!TextUtils.isEmpty(str2)) {
                        A0D = C40061rW.A0D(A0D, "pos", str2);
                    }
                } else {
                    throw null;
                }
            }
            if (!(this instanceof C68473Ka)) {
                C66663By c66663By = ((C3KZ) this).A00;
                C53712hO c53712hO2 = c66663By.A00;
                boolean z = c66663By.A02;
                C36881lW c36881lW = new C36881lW();
                c36881lW.A08 = "Giphy";
                c36881lW.A00 = Integer.valueOf(z ? 2 : 3);
                A01 = C53712hO.A00(c53712hO2, A0D, c36881lW);
            } else {
                C3C1 c3c1 = ((C68473Ka) this).A00;
                C53702hN c53702hN2 = c3c1.A00;
                boolean z2 = c3c1.A02;
                C36881lW c36881lW2 = new C36881lW();
                if (c53702hN2 == null) {
                    str = "Giphy";
                } else {
                    str = "Tenor";
                }
                c36881lW2.A08 = str;
                c36881lW2.A00 = Integer.valueOf(z2 ? 2 : 3);
                A01 = C53702hN.A01(c53702hN2, A0D, c36881lW2);
            }
            if (A01 != null && ((obj2 = A01.A01) == null || ((List) obj2).isEmpty())) {
                C36911lZ c36911lZ = new C36911lZ();
                if (!(c2mq instanceof C53702hN)) {
                    i = 0;
                } else {
                    i = 1;
                }
                c36911lZ.A00 = Integer.valueOf(i);
                if (locale != null) {
                    c36911lZ.A01 = locale.getLanguage();
                }
                c36911lZ.A02 = c2mq.A03.A04();
                c2mq.A05.A09(c36911lZ, 1);
                AnonymousClass011.A01(c36911lZ, "");
            }
            return A01;
        }
        throw null;
    }
}
