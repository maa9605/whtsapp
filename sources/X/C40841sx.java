package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLException;

/* renamed from: X.1sx */
/* loaded from: classes2.dex */
public final class C40841sx implements InterfaceC007103c {
    public static String A0D(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "cancel";
            case 2:
                return "failed_insufficient_space";
            case 3:
                return "failed_io";
            case 4:
                return "failed_oom";
            case 5:
                return "failed_bad_media";
            case 6:
                return "failed_no_permissions";
            case 7:
                return "failed_fnf";
            case 8:
                return "failed_server";
            case 9:
                return "failed_request";
            case 10:
                return "failed_request_timeout";
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return "failed_not_finalized";
            case 12:
                return "failed_optimistic_hash";
            case 13:
                return "failed_media_conn";
            case 14:
                return "failed_optimistic_network_unsafe";
            case 15:
                return "failed_throttle";
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return "failed_no_such_algorithm";
            case 17:
                return "failed_network";
            case 18:
                return "failed_watls";
            case 19:
                return "failed_url";
            case C0M6.A01 /* 20 */:
                return "failed_transcoding_unknown";
            case 21:
                return "failed_file_format_unsupported";
            case 22:
                return "failed_dns_lookup";
            case 23:
                return "failed_wamsys";
            case 24:
                return "failed_too_large";
            default:
                return "undefined";
        }
    }

    public static int A00(C0N7 c0n7) {
        int i = c0n7.A01;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? R.drawable.av_card : R.drawable.av_discover;
                }
                return R.drawable.av_amex;
            }
            return R.drawable.av_mc;
        }
        return R.drawable.av_visa;
    }

    public static int A01(C04010Ib c04010Ib, File file, URL url, C62932yn c62932yn, String str) {
        String str2 = c04010Ib.A0B;
        if (str2 == null) {
            C000200d.A1O(C000200d.A0P("MediaDownload/checkMediaHash/message-supplied media hash is null mediaHash="), c04010Ib.A0C);
        }
        if (str2 == null) {
            str2 = c62932yn.A01;
        }
        if (str == null) {
            StringBuilder A0P = C000200d.A0P("MediaDownload/MMS download failed to calculate hash; mediaHash=");
            A0P.append(c04010Ib.A0C);
            A0P.append("; url=");
            A0P.append(url);
            A0P.append("; downloadFile=");
            A0P.append(file.getAbsolutePath());
            A0P.append("; downloadFile.exists?=");
            A0P.append(file.exists());
            Log.w(A0P.toString());
            return 1;
        } else if (str.equals(str2)) {
            return 0;
        } else {
            StringBuilder A0P2 = C000200d.A0P("MediaDownload/MMS download failed due to hash mismatch; mediaHash=");
            A0P2.append(c04010Ib.A0C);
            A0P2.append("; url=");
            A0P2.append(url);
            A0P2.append("; receivedHash=");
            A0P2.append(str2);
            A0P2.append("; localHash=");
            A0P2.append(str);
            Log.w(A0P2.toString());
            return 7;
        }
    }

    public static int A02(C04010Ib c04010Ib, String str, URL url) {
        if (str == null) {
            StringBuilder A0P = C000200d.A0P("MediaDownload/MMS download failed during media decryption due to plaintext hash not calculated properly; mediaHash=");
            String str2 = c04010Ib.A0C;
            A0P.append(str2);
            A0P.append("; url=");
            A0P.append(url);
            A0P.append("; mediaHash=");
            C000200d.A1U(A0P, str2, "; calculatedHash=", str, "; mediaSize=");
            A0P.append(c04010Ib.A06);
            Log.w(A0P.toString());
            return 1;
        }
        String str3 = c04010Ib.A0C;
        if (str.equals(str3)) {
            return 0;
        }
        StringBuilder A0P2 = C000200d.A0P("MediaDownload/MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
        A0P2.append(str3);
        A0P2.append("; url=");
        A0P2.append(url);
        A0P2.append("; mediaHash=");
        C000200d.A1U(A0P2, str3, "; calculatedHash=", str, "; mediaSize=");
        A0P2.append(c04010Ib.A06);
        Log.w(A0P2.toString());
        return 2;
    }

    public static int A03(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((C0N2) list.get(i)).A01 == 2) {
                return i;
            }
        }
        return 0;
    }

    public static int A04(byte[] bArr) {
        if (bArr.length == 3) {
            return (bArr[2] & 255) | 0 | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        throw new C27871Pc((byte) 80, new SSLException("Invalid argument. Byte array is null or length != 3"));
    }

    public static int A05(byte[] bArr) {
        if (bArr != null && bArr.length == 2) {
            return (bArr[1] & 255) | 0 | ((bArr[0] & 255) << 8);
        }
        throw new C27871Pc((byte) 80, new SSLException("Invalid argument. Byte array is null or length != 2"));
    }

    public static long A06(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        throw new C27871Pc((byte) 80, new SSLException("Invalid argument. byte array is null or length != 4"));
    }

    public static Matrix A07(float f, RectF rectF, Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        matrix.setRotate(f);
        if (f == 90.0f) {
            matrix.preTranslate(0.0f, -rectF.height());
        } else if (f == 180.0f) {
            matrix.preTranslate(-rectF.width(), -rectF.height());
            return matrix;
        } else if (f == 270.0f) {
            matrix.preTranslate(-rectF.width(), 0.0f);
            return matrix;
        } else if (f != 0.0f) {
            throw new IllegalArgumentException();
        }
        return matrix;
    }

    public static C0FK A08(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = str;
        if (TextUtils.isEmpty(str2)) {
            List asList = Arrays.asList(str.split("\\|"));
            if (asList.size() != 2) {
                return null;
            }
            Object obj2 = asList.get(0);
            str2 = TextUtils.join(".", asList);
            obj = obj2;
        }
        return new C0FK(obj, str2);
    }

    public static AnonymousClass317 A09(Context context) {
        return new AnonymousClass317(context);
    }

    public static C4AV A0A(String str) {
        if (!TextUtils.isEmpty(str)) {
            int hashCode = str.hashCode();
            if (hashCode != 81882) {
                if (hashCode != 2023329) {
                    if (hashCode == 2212537 && str.equals("HDFC")) {
                        return new C4AV(R.string.hdfc_psp_name, R.drawable.hdfc_watermark);
                    }
                } else if (str.equals("AXIS")) {
                    return new C4AV(R.string.axis_psp_name, R.drawable.axis_watermark);
                }
            } else if (str.equals("SBI")) {
                return new C4AV(R.string.sbi_psp_name, R.drawable.sbi_watermark);
            }
        }
        return new C4AV(R.string.icici_psp_name, R.drawable.icici_watermark);
    }

    public static AnonymousClass092 A0B(C05U c05u, C48612Fx c48612Fx, String str, AbstractC005302j abstractC005302j, long j, UserJid userJid, Long l, int i, boolean z, boolean z2, int i2) {
        String str2;
        String str3;
        char c;
        int i3;
        String str4;
        C53432gu A0j = c48612Fx.A0j();
        String str5 = A0j.A04;
        if ((A0j.A00 & 64) == 64) {
            str2 = A0j.A05;
        } else {
            str2 = null;
        }
        int i4 = A0j.A01;
        if (i4 == 2) {
            if (i4 == 2) {
                str3 = (String) A0j.A03;
            } else {
                str3 = "";
            }
        } else {
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < A0j.A02.size(); i5++) {
            C53452gw c53452gw = (C53452gw) A0j.A02.get(i5);
            int i6 = c53452gw.A01;
            if (i6 == 1) {
                c = 1;
            } else {
                c = 3;
                if (i6 == 2) {
                    c = 2;
                }
            }
            String str6 = "";
            if (c == 1) {
                str6 = (i6 == 1 ? (C53462gx) c53452gw.A03 : C53462gx.A03).A01;
            } else if (c == 2) {
                str6 = (i6 == 2 ? (C53482gz) c53452gw.A03 : C53482gz.A03).A01;
            } else if (c == 3) {
                str6 = (i6 == 3 ? (C53472gy) c53452gw.A03 : C53472gy.A03).A01;
            }
            String A0L = AnonymousClass024.A0L(str6, 50);
            if (!TextUtils.isEmpty(A0L)) {
                int i7 = c53452gw.A01;
                if (i7 == 1) {
                    i3 = 1;
                    str4 = (i7 == 1 ? (C53462gx) c53452gw.A03 : C53462gx.A03).A02;
                } else if (i7 == 2) {
                    i3 = 2;
                    str4 = (i7 == 2 ? (C53482gz) c53452gw.A03 : C53482gz.A03).A02;
                } else {
                    i3 = 3;
                    str4 = (i7 == 3 ? (C53472gy) c53452gw.A03 : C53472gy.A03).A02;
                }
                arrayList.add(new C0PZ(A0L, str4, i3, false, i5));
            }
        }
        ArrayList arrayList2 = null;
        if (arrayList.size() > 0) {
            arrayList2 = arrayList;
            if (arrayList.size() > 5) {
                return null;
            }
        }
        return A0C(c05u, c48612Fx, str3, str5, str2, arrayList2, str, abstractC005302j, j, userJid, l, i, z, z2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.AnonymousClass092 A0C(X.C05U r20, X.C48612Fx r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.lang.String r26, X.AbstractC005302j r27, long r28, com.whatsapp.jid.UserJid r30, java.lang.Long r31, int r32, boolean r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40841sx.A0C(X.05U, X.2Fx, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, X.02j, long, com.whatsapp.jid.UserJid, java.lang.Long, int, boolean, boolean, int):X.092");
    }

    public static String A0E(C002301c c002301c, C0N7 c0n7) {
        String A06 = c002301c.A06(R.string.unknown);
        String A07 = C0N7.A07(c0n7.A01);
        if (A07 != null) {
            String A02 = C0N2.A02(c0n7.A00);
            if (A02 == null) {
                A02 = "";
            }
            String str = c0n7.A0A;
            if (str == null) {
                return A07;
            }
            return C000200d.A0L(C000200d.A0X(A07, " ", A02, " ", "•"), "•", A0M(str));
        }
        return A06;
    }

    public static String A0F(C002301c c002301c, C0N2 c0n2) {
        if (c0n2 != null) {
            if (TextUtils.isEmpty(null) && c0n2.A01 == 2) {
                return c002301c.A06(R.string.payments_primary_payment_method);
            }
            return null;
        }
        throw null;
    }

    public static String A0G(C0DV c0dv, C002301c c002301c, C0N2 c0n2) {
        return A0H(c0dv, c002301c, c0n2, true);
    }

    public static String A0H(C0DV c0dv, C002301c c002301c, C0N2 c0n2, boolean z) {
        if (c0n2 instanceof C0N7) {
            return A0E(c002301c, (C0N7) c0n2);
        }
        if (c0n2 instanceof C0N4) {
            String A06 = c002301c.A06(R.string.unknown);
            String str = c0n2.A0A;
            String str2 = c0n2.A08;
            return !TextUtils.isEmpty(str) ? str : !TextUtils.isEmpty(str2) ? str2 : A06;
        }
        String A062 = c002301c.A06(R.string.unknown);
        String str3 = c0n2.A08;
        if (str3 != null) {
            String str4 = c0n2.A0A;
            A062 = str4 != null ? C000200d.A0I(str3, " ••", A0M(str4)) : str3;
        }
        return !z ? A062 : c002301c.A0D(R.string.transaction_payment_method_info, A062, c002301c.A06(c0dv.A03().AC3()));
    }

    public static String A0I(File file) {
        try {
            return A0J(file, MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }

    public static String A0J(File file, MessageDigest messageDigest) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C0DD.A0I(file));
        try {
            A0d(bufferedInputStream, messageDigest);
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String A0K(String str) {
        return Base64.encodeToString(str.getBytes("UTF-8"), 11);
    }

    public static String A0L(String str) {
        MessageFormat messageFormat;
        String[] strArr;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replaceAll = str.replaceAll("[^\\d]", "");
        int length = replaceAll.length();
        if (replaceAll.startsWith("0800") && length == 11) {
            messageFormat = new MessageFormat("{0}-{1}-{2}");
            strArr = new String[]{replaceAll.substring(0, 4), replaceAll.substring(4, 7), replaceAll.substring(7)};
        } else if (length == 10 || length == 11) {
            messageFormat = new MessageFormat("{0} {1}-{2}");
            strArr = new String[]{replaceAll.substring(0, 2), replaceAll.substring(2, 6), replaceAll.substring(6)};
        } else if (length == 12) {
            messageFormat = new MessageFormat("{0}-{1}-{2}-{3}");
            strArr = new String[]{replaceAll.substring(0, 2), replaceAll.substring(2, 4), replaceAll.substring(4, 8), replaceAll.substring(8)};
        } else if (length != 8 && length != 9) {
            return str;
        } else {
            messageFormat = new MessageFormat("{0}-{1}");
            strArr = new String[2];
            strArr[0] = replaceAll.substring(0, length == 9 ? 5 : 4);
            strArr[1] = replaceAll.substring(length == 9 ? 5 : 4);
        }
        return messageFormat.format(strArr);
    }

    public static String A0M(String str) {
        int length = str.length();
        if (length > 4) {
            str = str.substring(length - 4);
        }
        int i = 0;
        int length2 = str.length();
        for (int i2 = length2 - 1; i2 >= 0 && Character.isDigit(str.charAt(i2)); i2--) {
            i++;
        }
        return i == length2 ? str : str.substring(length2 - i);
    }

    public static String A0N(String str) {
        if (str == null) {
            return null;
        }
        try {
            return A0S(new URL(str));
        } catch (MalformedURLException e) {
            Log.w("redactedversion/not-url", e);
            int length = str.length();
            if (length <= 25) {
                return "***";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, length - 25));
            sb.append("***");
            return sb.toString();
        }
    }

    public static String A0O(String str) {
        return TextUtils.isEmpty(str) ? str : C000200d.A0K(C000200d.A0P("[data localized "), str.getBytes().length, " bytes]");
    }

    public static String A0P(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = (str.length() + 1) >> 1;
        StringBuilder A0Q = C000200d.A0Q("[", length, " char]");
        A0Q.append(str.substring(length));
        return A0Q.toString();
    }

    public static String A0Q(String str) {
        return (TextUtils.isEmpty(str) || !str.contains("@")) ? "" : "SCRUBBED-VPA";
    }

    public static String A0R(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append("•");
        sb.append("•");
        sb.append(str2);
        return sb.toString();
    }

    public static String A0S(URL url) {
        String str;
        int length;
        if (url == null) {
            return null;
        }
        String path = url.getPath();
        if (path != null && (length = path.length()) > 25) {
            str = path.substring(0, length - 25);
        } else {
            str = "";
        }
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder authority = builder.scheme(url.getProtocol()).authority(url.getHost());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("***");
        if (path != null) {
            sb.append(path.substring(path.length() - 4));
            authority.path(sb.toString()).encodedQuery(url.getQuery());
            return builder.build().toString();
        }
        throw null;
    }

    public static String A0T(PublicKey publicKey) {
        return String.format("fp:%s", Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(publicKey.getEncoded()), 11));
    }

    public static String A0U(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x ", Byte.valueOf(bArr[i]));
        }
        return formatter.toString();
    }

    public static void A0V(Context context, C0DX c0dx, AnonymousClass093 anonymousClass093) {
        if (c0dx != null) {
            AbstractC005302j abstractC005302j = anonymousClass093.A0A;
            Intent intent = new Intent(context, c0dx.ACL());
            boolean z = anonymousClass093.A0O;
            String str = anonymousClass093.A0J;
            if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
                intent.putExtra("fMessageKeyId", str).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", C003101m.A07(abstractC005302j));
                intent.putExtra("extra_transaction_id", anonymousClass093.A0I);
                intent.putExtra("extra_transaction_detail_data", anonymousClass093);
                context.startActivity(intent);
                return;
            }
            throw new IllegalArgumentException("Intent already contains key.");
        }
    }

    public static void A0W(Intent intent, C49E c49e) {
        intent.putExtra("extra_payment_handle", c49e.A0B);
        intent.putExtra("extra_merchant_code", c49e.A01);
        intent.putExtra("extra_transaction_ref", c49e.A0A);
        intent.putExtra("extra_payee_name", c49e.A03);
        intent.putExtra("extra_transaction_ref_url", c49e.A07);
        intent.putExtra("extra_initiation_mode", c49e.A00);
        intent.putExtra("extra_purpose_code", c49e.A06);
        intent.putExtra("extra_payment_preset_amount", c49e.A04);
        intent.putExtra("extra_transaction_id", c49e.A09);
        intent.putExtra("extra_payment_preset_min_amount", c49e.A05);
    }

    public static void A0X(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, listView);
            view.measure(makeMeasureSpec, 0);
            i += view.getMeasuredHeight();
        }
        listView.getLayoutParams().height = ((adapter.getCount() - 1) * listView.getDividerHeight()) + i;
        listView.requestLayout();
    }

    public static void A0Y(AbstractC000600i abstractC000600i, C012005w c012005w, C01B c01b, C41961un c41961un, C0E3 c0e3, C43101wr c43101wr, C04010Ib c04010Ib, C43211x2 c43211x2, C43221x3 c43221x3, int i, int i2, File file, C42621w3 c42621w3) {
        File A02;
        byte[] bArr = c04010Ib.A0T;
        String str = c04010Ib.A0C;
        String str2 = c04010Ib.A0G;
        int i3 = c04010Ib.A00;
        long j = c04010Ib.A06;
        C0DC c0dc = c04010Ib.A08;
        boolean z = false;
        if (i3 > 0 && bArr != null) {
            if (c0dc == C0DC.A0I) {
                File A0M = c012005w.A0M(str, str2);
                if (A0M != null && !A0M.exists()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
                        if (C41961un.A0W(file, c0e3, c42621w3, bArr, str, i2, i3, j, A0M, byteArrayOutputStream, 16)) {
                            WebpUtils.createFirstThumbnail(byteArrayOutputStream.toByteArray(), i3, A0M.getAbsolutePath());
                            if (A0M.exists()) {
                                A0M.length();
                                byteArrayOutputStream.close();
                                z = true;
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder("CreateStickerThumbnail failed; mediaHash=");
                        sb.append(str);
                        Log.e(sb.toString(), e);
                    }
                }
            } else {
                File A022 = AbstractC012105x.A02(c012005w.A02.A06(".Thumbs"), str, str2, ".prog.thumb.jpg");
                if (A022 != null && !A022.exists()) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(A022);
                        if (C41961un.A0W(file, c0e3, c42621w3, bArr, str, i2, i3, j, A022, fileOutputStream, 2)) {
                            fileOutputStream.write(C41961un.A0A);
                            if (A022.exists()) {
                                A022.length();
                                fileOutputStream.close();
                                z = true;
                            }
                        }
                        fileOutputStream.close();
                    } catch (FileNotFoundException e2) {
                        StringBuilder sb2 = new StringBuilder("CreateProgressiveThumbnail failed could not find file progressive jpeg thumbnail; mediaHash=");
                        sb2.append(str);
                        Log.e(sb2.toString(), e2);
                    } catch (IOException e3) {
                        StringBuilder sb3 = new StringBuilder("CreateProgressiveThumbnail failed;mediaHash=");
                        sb3.append(str);
                        Log.e(sb3.toString(), e3);
                    }
                }
            }
        }
        if (z) {
            if (C0HW.A04(c0dc)) {
                File A0M2 = c012005w.A0M(str, str2);
                if (A0M2 != null) {
                    A0Z(abstractC000600i, c01b, c41961un, c43101wr, c04010Ib, c43211x2, A0M2);
                }
            } else {
                boolean z2 = c04010Ib.A0Q;
                if (C0HW.A02(c0dc) && z2 && !c04010Ib.A0K && c43211x2.A0B() == null && (A02 = AbstractC012105x.A02(c012005w.A02.A06(".Thumbs"), str, str2, ".prog.thumb.jpg")) != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(A02));
                        byte[] A2D = AnonymousClass088.A2D(bufferedInputStream);
                        synchronized (c43211x2) {
                            c43211x2.A0J = A2D;
                        }
                        bufferedInputStream.close();
                    } catch (IOException e4) {
                        Log.e("MediaDownload/createProgressiveThumbnail/created progressive/thumbnail could not be read", e4);
                    }
                }
            }
            byte[] A0B = c43221x3.A0Y.A0B();
            if (A0B != null) {
                c43221x3.A0K.A04(A0B);
            }
            if (c0dc == C0DC.A0I && i == 2) {
                c43211x2.A05();
            }
        }
    }

    public static void A0Z(AbstractC000600i abstractC000600i, C01B c01b, C41961un c41961un, C43101wr c43101wr, C04010Ib c04010Ib, C43211x2 c43211x2, File file) {
        if (c43211x2.A00() == 1 && C0HW.A03(c04010Ib.A08)) {
            return;
        }
        C23J A00 = new C23I(abstractC000600i, c01b, c41961un, c43101wr).A00(new C23H(c04010Ib.A08, file, c04010Ib.A0E, c04010Ib.A0K));
        if (A00 != null) {
            byte[] bArr = A00.A02;
            if (bArr != null) {
                synchronized (c43211x2) {
                    c43211x2.A0J = bArr;
                }
            }
            Pair pair = A00.A01;
            if (pair != null) {
                int intValue = ((Number) pair.first).intValue();
                synchronized (c43211x2) {
                    c43211x2.A0C = Integer.valueOf(intValue);
                }
                int intValue2 = ((Number) pair.second).intValue();
                synchronized (c43211x2) {
                    c43211x2.A0B = Integer.valueOf(intValue2);
                }
            }
            Pair pair2 = A00.A00;
            if (pair2 != null) {
                int intValue3 = ((Number) pair2.first).intValue();
                synchronized (c43211x2) {
                    c43211x2.A09 = Integer.valueOf(intValue3);
                }
                int intValue4 = ((Number) pair2.second).intValue();
                synchronized (c43211x2) {
                    c43211x2.A09 = Integer.valueOf(intValue4);
                }
            }
            byte[] bArr2 = A00.A03;
            synchronized (c43211x2) {
                c43211x2.A0K = bArr2;
            }
        }
    }

    public static void A0a(C012005w c012005w, C04020Ic c04020Ic, File file, File file2) {
        if (c04020Ic.A02() && !file.equals(file2)) {
            file.delete();
        } else if (c04020Ic.A01 != 1) {
        } else {
            file.delete();
            C43221x3.A01(c012005w, file2);
        }
    }

    public static void A0b(PaymentMethodRow paymentMethodRow, C0N2 c0n2) {
        if (c0n2 instanceof C0N7) {
            paymentMethodRow.A00.setImageResource(A00((C0N7) c0n2));
            return;
        }
        Bitmap A04 = c0n2.A04();
        if (A04 != null) {
            paymentMethodRow.A00.setImageBitmap(A04);
        } else {
            paymentMethodRow.A00.setImageResource(R.drawable.av_bank);
        }
    }

    public static void A0c(AnonymousClass092 anonymousClass092, String str, String str2, List list, AbstractC005302j abstractC005302j, Long l, int i) {
        anonymousClass092.A0d(abstractC005302j);
        if (l != null) {
            anonymousClass092.A0U = l;
        }
        anonymousClass092.A0A = i;
        ((InterfaceC03910Hq) anonymousClass092).ATy(new C0PY(str, str2, list));
    }

    public static void A0d(InputStream inputStream, MessageDigest messageDigest) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            }
            messageDigest.update(bArr, 0, read);
        }
    }

    public static void A0e(byte[] bArr, boolean z, C76513gi c76513gi) {
        Set set;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s = wrap.getShort();
        wrap.get(new byte[32]);
        byte[] bArr2 = new byte[(short) (((short) (wrap.get() & 255)) | 0)];
        wrap.get(bArr2);
        short s2 = wrap.getShort();
        byte b = wrap.get();
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        byte[] bArr4 = new byte[A05(bArr3)];
        wrap.get(bArr4);
        C68993Ms c68993Ms = new C68993Ms(bArr4);
        C68983Mr A00 = c68993Ms.A00((short) 43);
        if (A00 != null) {
            if (C68963Mp.A05.contains(Short.valueOf((short) A05(A00.A01)))) {
                byte[] bArr5 = c76513gi.A0n;
                if (bArr5 != null && !A0k(A00.A01, bArr5)) {
                    throw new C27871Pc((byte) 47, new SSLException("Supported version in server hello does not match HelloRetryRequest supported version."));
                }
                if (z) {
                    set = C68963Mp.A07;
                } else {
                    set = C68963Mp.A08;
                }
                HashSet hashSet = new HashSet(c68993Ms.A03.keySet());
                hashSet.removeAll(set);
                if (hashSet.size() != 0) {
                    throw new C27871Pc((byte) 47, new SSLException("Unexpected extension provided by the server"));
                }
                Short sh = C68963Mp.A01;
                if (s == 771) {
                    if (A0k(c76513gi.A0l, bArr2)) {
                        short s3 = c76513gi.A0V;
                        if (s3 != 0 && s3 != s2) {
                            throw new C27871Pc((byte) 47, new SSLException("Cipher suite in server hello does not match HelloRetryRequest cipher suite."));
                        }
                        if (c76513gi.A0F == null) {
                            throw null;
                        }
                        if (s2 != 4865) {
                            throw new C27871Pc((byte) 80, new SSLException("Server selected invalid cipher suite"));
                        }
                        if (b == 0) {
                            C68983Mr A002 = c68993Ms.A00((short) 51);
                            if (A002 != null) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(A002.A01);
                                short s4 = wrap2.getShort();
                                if (c76513gi.A0H == null) {
                                    throw null;
                                }
                                if (s4 == 29) {
                                    if (!z) {
                                        byte[] bArr6 = new byte[2];
                                        wrap2.get(bArr6);
                                        int A05 = A05(bArr6);
                                        if (c76513gi.A0H == null) {
                                            throw null;
                                        }
                                        if (A05 != 32) {
                                            StringBuilder A0Q = C000200d.A0Q("Key length mismatch ", A05, " != ");
                                            A0Q.append(32);
                                            throw new C27871Pc((byte) 80, new SSLException(A0Q.toString()));
                                        }
                                        byte[] bArr7 = new byte[32];
                                        c76513gi.A0m = bArr7;
                                        wrap2.get(bArr7);
                                    }
                                    C68983Mr A003 = c68993Ms.A00((short) 41);
                                    if (c76513gi.A0C.A03 != null && A003 != null) {
                                        if (A05(A003.A01) <= 0) {
                                            c76513gi.A0b = true;
                                            c76513gi.A0g = true;
                                        } else {
                                            StringBuilder sb = new StringBuilder("Incorrect PSK index value chosen by server ");
                                            sb.append(A003);
                                            throw new C27871Pc((byte) 80, new SSLException(sb.toString()));
                                        }
                                    }
                                    if (z) {
                                        c76513gi.A0n = A00.A01;
                                        c76513gi.A0V = s2;
                                        c76513gi.A0W = s4;
                                        C68983Mr A004 = c68993Ms.A00((short) 44);
                                        if (A004 != null) {
                                            ByteBuffer wrap3 = ByteBuffer.wrap(A004.A01);
                                            byte[] bArr8 = new byte[2];
                                            wrap3.get(bArr8);
                                            byte[] bArr9 = new byte[A05(bArr8)];
                                            wrap3.get(bArr9);
                                            c76513gi.A0k = bArr9;
                                        }
                                    }
                                    if (wrap.hasRemaining()) {
                                        throw new C27871Pc((byte) 80, new SSLException("Server Hello has more bytes than expected."));
                                    }
                                    return;
                                }
                                throw new C27871Pc((byte) 80, new SSLException("Key share algorithm mismatch."));
                            }
                            throw new C27871Pc((byte) 109, new SSLException("Key share extension not found."));
                        }
                        throw new C27871Pc((byte) 80, new SSLException("Invalid compression method.0"));
                    }
                    throw new C27871Pc((byte) 80, new SSLException("Bad session id"));
                }
                StringBuilder A0Q2 = C000200d.A0Q("Unexpected protocol version", s, " != ");
                A0Q2.append(sh);
                throw new C27871Pc((byte) 80, new SSLException(A0Q2.toString()));
            }
            throw new C27871Pc((byte) 110, new SSLException("Server sent an unsupported version."));
        }
        throw new C27871Pc((byte) 109, new SSLException("Supported version extension not found."));
    }

    public static boolean A0f(C0N2 c0n2) {
        int A08 = c0n2.A08();
        return A08 == 4 || A08 == 1 || A08 == 6 || A08 == 8 || A08 == 7;
    }

    public static boolean A0g(C003701t c003701t, AnonymousClass012 anonymousClass012, C000500h c000500h, AnonymousClass092 anonymousClass092) {
        if (c003701t.A0C(249)) {
            if (((anonymousClass092 instanceof AnonymousClass095) || (anonymousClass092 instanceof C09F)) && C003101m.A0Z(anonymousClass092.A0n.A00)) {
                SharedPreferences sharedPreferences = c000500h.A00;
                return (sharedPreferences.getLong("status_tab_last_opened_time", 0L) != 0 && anonymousClass012.A05() - sharedPreferences.getLong("status_tab_last_opened_time", 0L) <= 1209600000) || (sharedPreferences.getLong("registration_initialized_time", 0L) > 0 && anonymousClass012.A01() - sharedPreferences.getLong("registration_initialized_time", 0L) <= 1209600000);
            }
            return false;
        }
        return false;
    }

    public static boolean A0h(AnonymousClass097 anonymousClass097) {
        if (anonymousClass097 != null) {
            C09H c09h = anonymousClass097.A02;
            if (!TextUtils.isEmpty(anonymousClass097.A05) && c09h != null && c09h.A0U == null) {
                C09H c09h2 = anonymousClass097.A02;
                if (c09h2 != null) {
                    if (c09h2.A0F == null) {
                        return true;
                    }
                    return false;
                }
                throw null;
            }
            return false;
        }
        return false;
    }

    public static boolean A0i(File file) {
        try {
            C40851sy.A03(file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0063, code lost:
        if (r7.equals("04") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x006c, code lost:
        if (r7.equals("03") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0073, code lost:
        if (r7.equals("02") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x007a, code lost:
        if (r7.equals("01") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0083, code lost:
        if (r7.equals("00") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0099, code lost:
        if (r8.equals("05") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00a0, code lost:
        if (r8.equals("04") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00a2, code lost:
        r6 = !r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00a9, code lost:
        if (r8.equals("02") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b0, code lost:
        if (r8.equals("01") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b2, code lost:
        if (r6 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x003a, code lost:
        if (r7.equals("09") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0043, code lost:
        if (r7.equals("08") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x004c, code lost:
        if (r7.equals("07") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0055, code lost:
        if (r7.equals("06") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x005c, code lost:
        if (r7.equals("05") != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0j(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = X.C4AU.A01(r2)
            r1 = 0
            if (r0 == 0) goto L32
            boolean r0 = r2.equalsIgnoreCase(r3)
            if (r0 != 0) goto L32
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L32
            if (r5 == 0) goto L21
            if (r6 == 0) goto L21
            int r2 = X.AnonymousClass024.A01(r5, r1)
            int r0 = X.AnonymousClass024.A01(r6, r1)
            if (r2 > r0) goto L32
        L21:
            java.lang.String r5 = "05"
            java.lang.String r4 = "04"
            java.lang.String r3 = "02"
            java.lang.String r2 = "01"
            if (r7 == 0) goto L85
            int r0 = r7.hashCode()
            switch(r0) {
                case 1536: goto L7d;
                case 1537: goto L76;
                case 1538: goto L6f;
                case 1539: goto L66;
                case 1540: goto L5f;
                case 1541: goto L58;
                case 1542: goto L4f;
                case 1543: goto L46;
                case 1544: goto L3d;
                case 1545: goto L34;
                default: goto L32;
            }
        L32:
            r1 = 1
        L33:
            return r1
        L34:
            java.lang.String r0 = "09"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L32
            goto L85
        L3d:
            java.lang.String r0 = "08"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L32
            goto L85
        L46:
            java.lang.String r0 = "07"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L32
            goto L85
        L4f:
            java.lang.String r0 = "06"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L32
            goto L85
        L58:
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L32
            goto L85
        L5f:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L32
            goto L85
        L66:
            java.lang.String r0 = "03"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L32
            goto L85
        L6f:
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L32
            goto L85
        L76:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L32
            goto L85
        L7d:
            java.lang.String r0 = "00"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L32
        L85:
            java.lang.String r0 = "QR_CODE"
            boolean r6 = android.text.TextUtils.equals(r9, r0)
            if (r8 == 0) goto L32
            int r0 = r8.hashCode()
            switch(r0) {
                case 1537: goto Lac;
                case 1538: goto La5;
                case 1539: goto L94;
                case 1540: goto L9c;
                case 1541: goto L95;
                default: goto L94;
            }
        L94:
            goto L32
        L95:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L32
            goto La2
        L9c:
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L32
        La2:
            r6 = r6 ^ 1
            goto Lb2
        La5:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L32
            goto Lb2
        Lac:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L32
        Lb2:
            if (r6 != 0) goto L33
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40841sx.A0j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A0k(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length; i++) {
            boolean z2 = false;
            if (bArr[i] == bArr2[i]) {
                z2 = true;
            }
            z &= z2;
        }
        return z;
    }

    public static byte[] A0l(byte b, byte[] bArr) {
        int length;
        if (C69003Mt.A00.contains(Byte.valueOf(b)) && bArr != null && (length = bArr.length) <= 16777215) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 4);
            allocate.put(b);
            allocate.put(A0m(length));
            allocate.put(bArr);
            return allocate.array();
        }
        throw new C27871Pc((byte) 80, new SSLException(C000200d.A0F("Illegal arguments -  type ", b, " msg is null or bigger than", 16777215)));
    }

    public static byte[] A0m(int i) {
        if (i < 0 || i >= 16777216) {
            throw new C27871Pc((byte) 80, new SSLException(C000200d.A0E("Invalid argument. The supplied int value = ", i, " does not fit in 3 bytes.")));
        }
        return new byte[]{(byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A0n(int i) {
        if (i < 0 || i >= 65536) {
            throw new C27871Pc((byte) 80, new SSLException(C000200d.A0E("Invalid argument. The supplied int value = ", i, " does not fit in 2 bytes.")));
        }
        return new byte[]{(byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f9, code lost:
        if (r7 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x011d, code lost:
        if (r7 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x011f, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0122, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x014a, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014b, code lost:
        com.whatsapp.util.Log.w(X.C014406v.A01("PaymentMethodUtils", "fetchIcon/Close InputStream: "), r1);
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0124: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:114:0x0124 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A0o(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40841sx.A0o(java.lang.String):byte[]");
    }

    public static byte[] A0p(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(i);
        sb.append("#");
        sb.append(str2);
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }

    public static byte[] A0q(String str, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            try {
                byte[] bytes = C000200d.A0H("tls13 ", str).getBytes("UTF-8");
                int length2 = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(length + 1 + length2 + 1 + 2);
                allocate.put(A0n(i));
                short s = (short) length2;
                if (s >= 0 && s < 256) {
                    allocate.put((byte) (s & 255));
                    allocate.put(bytes);
                    allocate.put((byte) length);
                    allocate.put(bArr);
                    return allocate.array();
                }
                throw new C27871Pc((byte) 80, new SSLException(C000200d.A0E("Invalid argument. Short val = ", s, " cannot fit in single byte")));
            } catch (UnsupportedEncodingException e) {
                throw new C27871Pc((byte) 80, new SSLException(e));
            }
        }
        throw new C27871Pc((byte) 80, new SSLException("Context cannot be null when generating info"));
    }

    public static byte[] A0r(byte[] bArr) {
        if (bArr != null) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                byte[] bArr2 = new byte[3];
                wrap.get(bArr2);
                int A04 = A04(bArr2);
                byte[] bArr3 = new byte[A04];
                wrap.get(bArr3);
                if (!C69003Mt.A00.contains(Byte.valueOf(b)) || A04 > 16777215) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received an invalid handshake - type ");
                    sb.append((int) b);
                    sb.append(" len ");
                    sb.append(A04);
                    throw new C27871Pc((byte) 80, new SSLException(sb.toString()));
                }
                return bArr3;
            } catch (BufferUnderflowException e) {
                throw new C27871Pc((byte) 80, new SSLException("Invalid handshake message", e));
            }
        }
        throw new C27871Pc((byte) 80, new SSLException("Illegal argument - handshake is null"));
    }

    public static byte[] A0s(byte[] bArr, byte[] bArr2, String str) {
        try {
            str = str.replace("-", "");
            StringBuilder sb = new StringBuilder();
            sb.append("Hmac");
            sb.append(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hmac");
            sb2.append(str);
            Mac mac = Mac.getInstance(sb2.toString());
            mac.init(secretKeySpec);
            return mac.doFinal(bArr2);
        } catch (InvalidKeyException e) {
            throw new C27871Pc((byte) 80, new SSLException("Invalid key", e));
        } catch (NoSuchAlgorithmException e2) {
            throw new C27871Pc((byte) 80, new SSLException(C000200d.A0I("Hmac", str, " not found"), e2));
        }
    }
}
