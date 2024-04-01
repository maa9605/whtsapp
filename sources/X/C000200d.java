package X;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.00d */
/* loaded from: classes.dex */
public class C000200d {
    public static int A00(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    public static Bundle A01(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static Bundle A02(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static AlphaAnimation A03(float f, float f2, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }

    public static Long A04(Long l) {
        return Long.valueOf(l.longValue() + 1);
    }

    public static Long A05(Long l, long j) {
        return Long.valueOf(j - l.longValue());
    }

    public static String A07(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String A08(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String A0A(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String A0B(C0BA c0ba, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(c0ba);
        sb.append(str);
        return sb.toString();
    }

    public static String A0C(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A0F());
        return sb.toString();
    }

    public static String A0D(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A0E(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0F(String str, int i, String str2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public static String A0G(String str, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(uri);
        return sb.toString();
    }

    public static String A0H(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0I(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String A0J(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String A0K(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String A0L(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0M(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String A0N(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String A0O(XmlPullParser xmlPullParser, StringBuilder sb) {
        sb.append(xmlPullParser.getName());
        return sb.toString();
    }

    public static StringBuilder A0P(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0Q(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0R(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder A0S(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0T(String str, AbstractC005302j abstractC005302j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(abstractC005302j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0U(String str, UserJid userJid, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(userJid);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0V(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0W(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder A0X(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static ArrayList A0Y(String str) {
        Log.i(str);
        return new ArrayList();
    }

    public static void A0Z(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL(str);
        sQLiteDatabase.execSQL(str2);
        sQLiteDatabase.execSQL(str3);
    }

    public static void A0a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.execSQL(str);
        sQLiteDatabase.execSQL(str2);
        sQLiteDatabase.execSQL(str3);
        sQLiteDatabase.execSQL(str4);
    }

    public static void A0e(AnonymousClass012 anonymousClass012, long j, C05D c05d, String str) {
        c05d.A01(str, anonymousClass012.A04() - j);
    }

    public static void A0f(C000500h c000500h, String str) {
        c000500h.A0D().remove(str).apply();
    }

    public static void A0g(C000500h c000500h, String str, int i) {
        c000500h.A0D().putInt(str, i).apply();
    }

    public static void A0h(C000500h c000500h, String str, long j) {
        c000500h.A0D().putLong(str, j).apply();
    }

    public static void A0i(C000500h c000500h, String str, String str2) {
        c000500h.A0D().putString(str, str2).apply();
    }

    public static void A0j(C000500h c000500h, String str, boolean z) {
        c000500h.A0D().putBoolean(str, z).apply();
    }

    public static void A0k(C0EU c0eu, String str, String str2) {
        c0eu.A04().edit().putString(str, str2).apply();
    }

    public static void A0l(C0EU c0eu, String str, boolean z) {
        c0eu.A04().edit().putBoolean(str, z).apply();
    }

    public static void A0m(C0HC c0hc, StringBuilder sb) {
        sb.append(c0hc.A01());
        Log.i(sb.toString());
    }

    public static void A0n(C0EW c0ew, String str, int i) {
        c0ew.A03().putInt(str, i).apply();
    }

    public static void A0o(File file, StringBuilder sb) {
        sb.append(file.getAbsolutePath());
        Log.e(sb.toString());
    }

    public static void A0p(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A0q(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A0r(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A0s(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        android.util.Log.w(str2, sb.toString());
    }

    public static void A0t(String str, int i, String str2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        Log.i(sb.toString());
    }

    public static void A0u(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A0v(String str, AbstractC005302j abstractC005302j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(abstractC005302j);
        Log.i(sb.toString());
    }

    public static void A0w(String str, AbstractC005302j abstractC005302j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(abstractC005302j);
        Log.w(sb.toString());
    }

    public static void A0x(String str, UserJid userJid) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public static void A0y(String str, UserJid userJid, ArrayList arrayList) {
        arrayList.add(new C04P(str, userJid));
    }

    public static void A0z(String str, AnonymousClass094 anonymousClass094) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(anonymousClass094);
        Log.i(sb.toString());
    }

    public static void A10(String str, AnonymousClass094 anonymousClass094) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(anonymousClass094);
        Log.w(sb.toString());
    }

    public static void A11(String str, C04420Kc c04420Kc) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(c04420Kc);
        Log.i(sb.toString());
    }

    public static void A12(String str, File file, IOException iOException) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(file);
        Log.e(sb.toString(), iOException);
    }

    public static void A13(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
    }

    public static void A14(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A15(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString());
    }

    public static void A16(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        android.util.Log.e("ParametersHelper", sb.toString());
    }

    public static void A17(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        android.util.Log.w(str3, sb.toString());
    }

    public static void A18(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        Log.i(sb.toString());
    }

    public static void A19(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        Log.w(sb.toString());
    }

    public static void A1A(String str, String str2, ArrayList arrayList) {
        arrayList.add(new C04P(str, str2, null, (byte) 0));
    }

    public static void A1B(String str, String str2, ArrayList arrayList) {
        arrayList.add(new C02590Ca(str, (C04P[]) null, str2));
    }

    public static void A1C(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1D(String str, byte[] bArr, ArrayList arrayList) {
        arrayList.add(new C02590Ca(str, null, null, bArr));
    }

    public static void A1E(StringBuffer stringBuffer, String str, String str2) {
        stringBuffer.append(str);
        stringBuffer.append('\'');
        stringBuffer.append(str2);
    }

    public static void A1F(StringBuilder sb, int i) {
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A1G(StringBuilder sb, int i) {
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A1H(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void A1I(StringBuilder sb, long j) {
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A1J(StringBuilder sb, UserJid userJid) {
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public static void A1K(StringBuilder sb, AnonymousClass094 anonymousClass094) {
        sb.append(anonymousClass094);
        Log.w(sb.toString());
    }

    public static void A1L(StringBuilder sb, AnonymousClass094 anonymousClass094, boolean z) {
        sb.append(anonymousClass094);
        C000700j.A09(z, sb.toString());
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        Log.e(sb.toString());
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        Log.i(sb.toString());
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        Log.w(sb.toString());
    }

    public static void A1P(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    public static void A1Q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A1R(StringBuilder sb, String str, String str2, int i) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A1S(StringBuilder sb, String str, String str2, int i, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void A1T(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A1U(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A1V(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1W(ArrayList arrayList, StringBuilder sb) {
        sb.append(arrayList.size());
        Log.i(sb.toString());
    }

    public static RuntimeException A06(String str, String str2) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": glError ");
                sb.append(glGetError);
                Log.e(sb.toString());
            } else {
                return new RuntimeException(str2);
            }
        }
    }

    public static String A09(long j, AnonymousClass012 anonymousClass012, C002301c c002301c) {
        return C002501g.A0D(c002301c, anonymousClass012.A06(j - TimeZone.getTimeZone("Asia/Kolkata").getRawOffset()));
    }

    public static void A0b(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C02770Cu();
    }

    public static void A0c(RestoreFromBackupActivity restoreFromBackupActivity, int i, int i2) {
        View findViewById = restoreFromBackupActivity.findViewById(i);
        if (findViewById == null) {
            throw null;
        }
        findViewById.setVisibility(i2);
    }

    public static void A0d(C0KQ c0kq, String str, long j) {
        c0kq.A02().edit().putLong(str, j).apply();
    }
}
