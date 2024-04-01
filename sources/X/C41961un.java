package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.search.verification.client.R;
import com.whatsapp.AudioPickerActivity;
import com.whatsapp.GifHelper;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.1un */
/* loaded from: classes2.dex */
public class C41961un extends C0DD {
    public static final byte[] A0A = {-1, -39};
    public static volatile C41961un A0B;
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C018508q A02;
    public final C01B A03;
    public final C000400f A04;
    public final C02E A05;
    public final C001200o A06;
    public final C002301c A07;
    public final C02C A08;
    public final InterfaceC002901k A09;

    public C41961un(C001200o c001200o, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C01B c01b, C02E c02e, C002301c c002301c, C000400f c000400f, C02C c02c) {
        this.A06 = c001200o;
        this.A02 = c018508q;
        this.A00 = abstractC000600i;
        this.A09 = interfaceC002901k;
        this.A01 = c012005w;
        this.A03 = c01b;
        this.A05 = c02e;
        this.A07 = c002301c;
        this.A04 = c000400f;
        this.A08 = c02c;
        c02c.A00.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public static int A0R(AnonymousClass097 anonymousClass097, C0CB c0cb) {
        C0DC A02 = C0DC.A02(anonymousClass097);
        AnonymousClass094 anonymousClass094 = anonymousClass097.A0n;
        boolean z = anonymousClass094.A02;
        if (A02 == C0DC.A0I) {
            return 2;
        }
        if (z) {
            return 3;
        }
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            C003701t c003701t = c0cb.A0N;
            C05M c05m = c0cb.A0J;
            C05W c05w = c0cb.A08;
            if (abstractC005302j == null || !c003701t.A0C(382) || AnonymousClass029.A05(c05m, c05w, abstractC005302j) <= 0) {
                int i = c0cb.A07(abstractC005302j).A00;
                if (i == 0) {
                    return !c0cb.A0O() ? 2 : 1;
                } else if (i == 2) {
                    return 1;
                }
            }
            return 2;
        }
        throw null;
    }

    public static C41961un A0S() {
        if (A0B == null) {
            synchronized (C41961un.class) {
                if (A0B == null) {
                    A0B = new C41961un(C001200o.A01, C018508q.A00(), AbstractC000600i.A00(), C002801j.A00(), C012005w.A00(), C01B.A00(), C02E.A00(), C002301c.A00(), C000400f.A00(), C02C.A00());
                }
            }
        }
        return A0B;
    }

    public static String A0T(String str) {
        if (str == null) {
            return "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c = 0;
                    break;
                }
                break;
            case -1248334925:
                if (str.equals("application/pdf")) {
                    c = 2;
                    break;
                }
                break;
            case -1248332507:
                if (str.equals("application/rtf")) {
                    c = 11;
                    break;
                }
                break;
            case -1073633483:
                if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                    c = 5;
                    break;
                }
                break;
            case -1071817359:
                if (str.equals("application/vnd.ms-powerpoint")) {
                    c = '\b';
                    break;
                }
                break;
            case -1050893613:
                if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                    c = 3;
                    break;
                }
                break;
            case -1004747228:
                if (str.equals("text/csv")) {
                    c = '\f';
                    break;
                }
                break;
            case -1004732798:
                if (str.equals("text/rtf")) {
                    c = '\n';
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c = 1;
                    break;
                }
                break;
            case -366307023:
                if (str.equals("application/vnd.ms-excel")) {
                    c = 7;
                    break;
                }
                break;
            case 817335912:
                if (str.equals("text/plain")) {
                    c = '\t';
                    break;
                }
                break;
            case 904647503:
                if (str.equals("application/msword")) {
                    c = 6;
                    break;
                }
                break;
            case 1993842850:
                if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "jpg";
            case 1:
                return "png";
            case 2:
                return "pdf";
            case 3:
                return "docx";
            case 4:
                return "xlsx";
            case 5:
                return "pptx";
            case 6:
                return "doc";
            case 7:
                return "xls";
            case '\b':
                return "ppt";
            case '\t':
                return "txt";
            case '\n':
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return "rtf";
            case '\f':
                return "csv";
            default:
                String A0C = C42591vz.A0C(str, false);
                if (TextUtils.isEmpty(A0C)) {
                    String A0D = C42591vz.A0D(str, false);
                    if (TextUtils.isEmpty(A0D)) {
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                        return extensionFromMimeType != null ? extensionFromMimeType : "";
                    }
                    return A0D;
                }
                return A0C;
        }
    }

    public static void A0U(C018508q c018508q, C012005w c012005w, C02O c02o, int i, Activity activity, AbstractC005302j abstractC005302j) {
        Intent intent;
        if (i == 4) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (Build.VERSION.SDK_INT == 18 && Build.MODEL.contains("Nexus")) {
                intent.putExtra("output", Uri.fromFile(C02180Ae.A0d(activity, c012005w, c02o, C0DC.A0N, ".mp4", 1)));
            }
        } else if (i != 5) {
            switch (i) {
                case 21:
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    break;
                case 22:
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI, activity, GalleryPicker.class);
                    intent.putExtra("max_items", 30);
                    break;
                case 23:
                    intent = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", AnonymousClass024.A04(activity, C02180Ae.A0d(activity, c012005w, c02o, C0DC.A0A, ".jpg", 1)));
                    intent.setFlags(2);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new Intent(activity, AudioPickerActivity.class);
            intent.putExtra("jid", abstractC005302j.getRawString());
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("mediafileutils/start-activity ", e);
            c018508q.A07(R.string.activity_not_found, 0);
        }
    }

    public static void A0V(C42611w2 c42611w2, Uri.Builder builder) {
        Uri uri = c42611w2.A0F;
        int parseInt = uri.getQueryParameter("rotation") != null ? Integer.parseInt(uri.getQueryParameter("rotation")) : 0;
        if (c42611w2.A01() != 0) {
            parseInt = (c42611w2.A01() + parseInt) % 360;
        }
        if (parseInt != 0) {
            builder.appendQueryParameter("rotation", Integer.toString(parseInt));
        }
        if (uri.getQueryParameter("flip-h") != null) {
            builder.appendQueryParameter("flip-h", uri.getQueryParameter("flip-h"));
        }
    }

    public static boolean A0W(File file, C0E3 c0e3, C42621w3 c42621w3, byte[] bArr, String str, int i, int i2, long j, File file2, OutputStream outputStream, int i3) {
        OutputStream outputStream2;
        try {
            try {
                FileInputStream A0I = C0DD.A0I(file);
                try {
                    outputStream2 = new OutputStream(outputStream, i2) { // from class: X.1w4
                        public long A00;
                        public final int A01;
                        public final OutputStream A02;

                        {
                            this.A02 = outputStream;
                            this.A01 = i2;
                        }

                        @Override // java.io.OutputStream
                        public void write(int i4) {
                            if (this.A00 >= this.A01) {
                                return;
                            }
                            this.A02.write(i4);
                            this.A00++;
                        }
                    };
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    new C42641w5(bArr, c42621w3, j).A00(0L, i, A0I, outputStream2, 0);
                    outputStream2.close();
                    A0I.close();
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (C42651w6 e) {
                e = e;
                StringBuilder sb = new StringBuilder("CreateProgressiveThumbnail failed  tomatch hash for progressive jpeg thumbnail; mediaHash=");
                sb.append(str);
                Log.e(sb.toString(), e);
                c0e3.A09(i3, false, 0L, new int[]{i2}, j);
                file2.delete();
                return false;
            }
        } catch (C42651w6 e2) {
            e = e2;
            StringBuilder sb2 = new StringBuilder("CreateProgressiveThumbnail failed  tomatch hash for progressive jpeg thumbnail; mediaHash=");
            sb2.append(str);
            Log.e(sb2.toString(), e);
            c0e3.A09(i3, false, 0L, new int[]{i2}, j);
            file2.delete();
            return false;
        }
    }

    public byte A0X(Uri uri) {
        ContentResolver A07 = this.A05.A07();
        String A0K = C0DD.A0K(A07, uri);
        try {
            if ("image/gif".equals(A0K)) {
                C02C c02c = this.A08;
                try {
                    AbstractC40861sz.A04(A07, c02c, uri);
                    return AbstractC40861sz.A04(A07, c02c, uri).A02 ^ true ? (byte) 1 : (byte) 13;
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            Log.e("Media file cannot be read", e);
        }
        byte A00 = C0DD.A00(A0K);
        if (A00 == 0) {
            return (byte) 9;
        }
        return A00;
    }

    public byte A0Y(C42611w2 c42611w2) {
        Byte A06 = c42611w2.A06();
        if (A06 == null) {
            A06 = Byte.valueOf(A0X(c42611w2.A0F));
            if (A06.byteValue() == 3 && GifHelper.A02(c42611w2.A05())) {
                A06 = (byte) 13;
            }
        }
        return A06.byteValue();
    }

    public Bitmap A0Z(Uri uri, int i, int i2) {
        Bitmap A0a;
        if (uri != null && !TextUtils.isEmpty(uri.toString())) {
            StringBuilder sb = new StringBuilder("sample_rotate_image/from uri:");
            sb.append(uri);
            Log.i(sb.toString());
            Matrix A0A2 = C0DD.A0A(this.A05.A07(), uri);
            BitmapFactory.Options A0b = A0b(uri, i);
            try {
                A0a = A0a(uri, i, i2, A0b, A0A2);
            } catch (OutOfMemoryError e) {
                int i3 = A0b.inSampleSize << 1;
                A0b.inSampleSize = i3;
                StringBuilder A0P = C000200d.A0P("sample_rotate_image/oom ");
                A0P.append(i3);
                Log.i(A0P.toString(), e);
                A0a = A0a(uri, i, i2, A0b, A0A2);
            }
            A0a.isMutable();
            StringBuilder sb2 = new StringBuilder("sample_rotate_image/final_size:");
            sb2.append(A0a.getWidth());
            sb2.append(" | ");
            sb2.append(A0a.getHeight());
            Log.i(sb2.toString());
            return A0a;
        }
        throw new FileNotFoundException(C000200d.A0G("No file ", uri));
    }

    /* JADX WARN: Finally extract failed */
    public Bitmap A0a(Uri uri, int i, int i2, BitmapFactory.Options options, Matrix matrix) {
        InputStream A0e = A0e(uri);
        try {
            Bitmap A0A2 = C002701i.A0A(A0e, options);
            if (A0A2 != null && A0A2.getWidth() != 0 && A0A2.getHeight() != 0) {
                A0e.close();
                return C0DD.A08(A0A2, matrix, i, i2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("sample_rotate_image/not_a_image:");
            sb.append(uri);
            Log.i(sb.toString());
            throw new C42671w8();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0e.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public BitmapFactory.Options A0b(Uri uri, int i) {
        int i2;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A0e = A0e(uri);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A0e, null, options);
                A0e.close();
                int i3 = options.outWidth;
                if (i3 > 0 && (i2 = options.outHeight) > 0) {
                    options.inSampleSize = 1;
                    int i4 = 1;
                    int max = Math.max(i3, i2);
                    while (true) {
                        max >>= 1;
                        if (max > (i << 3) / 10) {
                            i4 <<= 1;
                            options.inSampleSize = i4;
                        } else {
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            options.inScaled = false;
                            options.inPurgeable = true;
                            options.inInputShareable = true;
                            StringBuilder A0P = C000200d.A0P("sample_rotate_image/width=");
                            A0P.append(i3);
                            A0P.append(" | height=");
                            A0P.append(i2);
                            A0P.append(" | sample_size=");
                            C000200d.A1F(A0P, i4);
                            options.inPreferQualityOverSpeed = true;
                            options.inMutable = true;
                            return options;
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("sample_rotate_image/not_a_image:");
                    sb.append(uri);
                    Log.i(sb.toString());
                    throw new C42671w8();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A0e.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } else {
            throw new FileNotFoundException(C000200d.A0G("No file ", uri));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:226:0x01d4
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.io.File A0c(android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41961un.A0c(android.net.Uri):java.io.File");
    }

    public File A0d(String str, long j) {
        long A03 = this.A04.A03();
        if (j >= 0 && A03 - j > 104857600) {
            File file = this.A01.A04().A09;
            AbstractC012105x.A03(file, false);
            return AbstractC012105x.A01(file, str);
        }
        StringBuilder A0S = C000200d.A0S("mediafileutils/getsharedfileforsize/returning external file; size=", j, "; internalAvailable=");
        A0S.append(A03);
        Log.w(A0S.toString());
        return AbstractC012105x.A01(this.A01.A0B(), str);
    }

    public InputStream A0e(Uri uri) {
        InputStream openInputStream;
        Uri build = uri.buildUpon().query(null).build();
        File A05 = AnonymousClass024.A05(build);
        if (A05 != null) {
            openInputStream = new FileInputStream(A05);
        } else {
            ContentResolver A07 = this.A05.A07();
            if (A07 != null) {
                openInputStream = A07.openInputStream(build);
                if (openInputStream == null) {
                    throw new IOException(C000200d.A0G("Unable to open stream for uri=", build));
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if (openInputStream instanceof FileInputStream) {
            this.A08.A07((FileInputStream) openInputStream);
        }
        return openInputStream;
    }

    public void A0f(Uri uri, C0B5 c0b5, InterfaceC42681w9 interfaceC42681w9) {
        this.A09.ARy(new C0HS(this.A02, this, this.A07, c0b5, uri, interfaceC42681w9) { // from class: X.1wA
            public final Uri A00;
            public final C018508q A01;
            public final C002301c A02;
            public final InterfaceC42681w9 A03;
            public final C41961un A04;
            public final WeakReference A05;

            {
                this.A01 = r2;
                this.A04 = this;
                this.A02 = r4;
                this.A05 = new WeakReference(c0b5);
                this.A00 = uri;
                this.A03 = interfaceC42681w9;
            }

            @Override // X.C0HS
            public void A06() {
                C0B5 c0b52 = (C0B5) this.A05.get();
                if (c0b52 != null) {
                    c0b52.AUr(0, R.string.media_loading);
                }
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                try {
                    return this.A04.A0c(this.A00);
                } catch (IOException e) {
                    return e;
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C0B5 c0b52 = (C0B5) this.A05.get();
                if (c0b52 != null) {
                    c0b52.ARS();
                }
                if (obj instanceof File) {
                    this.A03.AKN((File) obj);
                } else if (obj instanceof IOException) {
                    Throwable th = (Throwable) obj;
                    StringBuilder sb = new StringBuilder("mediafileutils/getfilefrommediastoreasync/ioerror ");
                    sb.append(th);
                    Log.e(sb.toString());
                    if (th.getMessage() != null && th.getMessage().contains("No space")) {
                        this.A01.A0D(c0b52, this.A02.A06(R.string.error_no_disc_space));
                    } else {
                        this.A01.A07(R.string.share_failed, 0);
                    }
                } else {
                    this.A01.A07(R.string.share_failed, 0);
                }
            }
        }, new Void[0]);
    }

    public void A0g(File file) {
        if (file != null) {
            try {
                if (this.A01.A0S(file)) {
                    AnonymousClass024.A0f(file);
                }
            } catch (IOException e) {
                C000200d.A12("mediafileutils/unable to delete file ", file, e);
            }
        }
    }
}
