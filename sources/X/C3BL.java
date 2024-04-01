package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.provider.MediaStore;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3BL */
/* loaded from: classes2.dex */
public abstract class C3BL implements InterfaceC52142a8 {
    public Cursor A00;
    public final int A02;
    public final ContentResolver A03;
    public final Uri A04;
    public final C001200o A06;
    public final C2AQ A07;
    public final C02C A08;
    public final String A09;
    public final C06F A05 = new C06F(512);
    public boolean A01 = false;

    public C3BL(C001200o c001200o, C2AQ c2aq, C02C c02c, Uri uri, int i, String str) {
        Cursor query;
        String[] strArr;
        String[] strArr2;
        this.A06 = c001200o;
        this.A07 = c2aq;
        this.A08 = c02c;
        this.A03 = c001200o.A00.getContentResolver();
        this.A02 = i;
        this.A04 = uri;
        this.A09 = str;
        if (this instanceof C3KR) {
            ContentResolver contentResolver = this.A03;
            Uri uri2 = this.A04;
            String[] strArr3 = C3KR.A00;
            String str2 = this.A09;
            query = MediaStore.Images.Media.query(contentResolver, uri2, strArr3, str2 != null ? C000200d.A0L(C000200d.A0P("bucket_id = '"), str2, "'") : null, null, A02());
        } else if (this instanceof C3KO) {
            ContentResolver contentResolver2 = this.A03;
            Uri uri3 = this.A04;
            String[] strArr4 = C3KO.A01;
            String str3 = this.A09;
            String str4 = str3 == null ? "(mime_type in (?, ?))" : "(mime_type in (?, ?)) AND bucket_id = ?";
            String[] strArr5 = C3KO.A00;
            if (str3 != null) {
                int length = strArr5.length;
                strArr = new String[length + 1];
                System.arraycopy(strArr5, 0, strArr, 0, length);
                strArr[length] = str3;
            } else {
                strArr = strArr5;
            }
            query = MediaStore.Images.Media.query(contentResolver2, uri3, strArr4, str4, strArr, A02());
        } else if (this instanceof C3KM) {
            ContentResolver contentResolver3 = this.A03;
            Uri uri4 = this.A04;
            String[] strArr6 = C3KM.A01;
            String str5 = this.A09;
            String str6 = str5 == null ? "(mime_type in (?))" : "(mime_type in (?)) AND bucket_id = ?";
            String[] strArr7 = C3KM.A00;
            if (str5 != null) {
                int length2 = strArr7.length;
                strArr2 = new String[length2 + 1];
                System.arraycopy(strArr7, 0, strArr2, 0, length2);
                strArr2[length2] = str5;
            } else {
                strArr2 = strArr7;
            }
            query = MediaStore.Images.Media.query(contentResolver3, uri4, strArr6, str6, strArr2, A02());
        } else if (!(this instanceof C3KK)) {
            query = this.A03.query(this.A04, C40481sK.A05, null, null, A02());
        } else {
            ContentResolver contentResolver4 = this.A03;
            Uri uri5 = this.A04;
            String[] strArr8 = C3KK.A00;
            String str7 = this.A09;
            query = contentResolver4.query(uri5, strArr8, str7 == null ? "media_type in (1, 3)" : "media_type in (1, 3) and bucket_id=?", str7 == null ? null : new String[]{str7}, A02());
        }
        this.A00 = query;
        if (query == null) {
            Log.w("medialist/createCursor returns null");
        }
        this.A05.A07(0);
    }

    public final Cursor A00() {
        synchronized (this) {
            Cursor cursor = this.A00;
            if (cursor == null) {
                return null;
            }
            if (this.A01) {
                cursor.requery();
                this.A01 = false;
            }
            return this.A00;
        }
    }

    public Uri A01(long j) {
        try {
            Uri uri = this.A04;
            if (ContentUris.parseId(uri) != j) {
                Log.e("medialist/id mismatch");
            }
            return uri;
        } catch (NumberFormatException unused) {
            return ContentUris.withAppendedId(this.A04, j);
        }
    }

    public String A02() {
        String str = this.A02 == 1 ? " ASC" : " DESC";
        return C000200d.A0J("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end", str, ", _id", str);
    }

    @Override // X.InterfaceC52142a8
    public InterfaceC52102a4 AB8(int i) {
        C06F c06f = this.A05;
        Integer valueOf = Integer.valueOf(i);
        InterfaceC52102a4 interfaceC52102a4 = (InterfaceC52102a4) c06f.A04(valueOf);
        if (interfaceC52102a4 == null) {
            Cursor A00 = A00();
            InterfaceC52102a4 interfaceC52102a42 = null;
            if (A00 == null) {
                return null;
            }
            synchronized (this) {
                if (A00.moveToPosition(i)) {
                    if (!(this instanceof C3KR)) {
                        if (!(this instanceof C3KO)) {
                            if (!(this instanceof C3KM)) {
                                if (!(this instanceof C3KK)) {
                                    String string = A00.getString(1);
                                    if (string != null) {
                                        long j = A00.getLong(2);
                                        short s = A00.getShort(5);
                                        File file = new File(string);
                                        if (s == 1) {
                                            interfaceC52102a42 = new C3KF(file, j);
                                        } else if (s == 3) {
                                            interfaceC52102a42 = new C3KI(file, j, A00.getLong(6));
                                        } else if (s == 13) {
                                            interfaceC52102a42 = new C3KE(file, j, A00.getLong(6));
                                        }
                                    }
                                } else {
                                    long j2 = A00.getLong(0);
                                    String string2 = A00.getString(1);
                                    long j3 = A00.getLong(5);
                                    if (j3 == 0) {
                                        j3 = A00.getLong(4) * 1000;
                                    }
                                    String string3 = A00.getString(2);
                                    int i2 = A00.getInt(3);
                                    long j4 = A00.getLong(7);
                                    File file2 = string2 != null ? new File(string2) : null;
                                    if (i2 == 3) {
                                        if (file2 != null && GifHelper.A02(file2)) {
                                            C001200o c001200o = this.A06;
                                            A00.getPosition();
                                            interfaceC52102a42 = new C3BK(c001200o, j2, A01(j2), string2, string3, j3, j4) { // from class: X.3KL
                                                @Override // X.InterfaceC52102a4
                                                public int getType() {
                                                    return 2;
                                                }

                                                @Override // X.InterfaceC52102a4
                                                public Bitmap AVV(int i3) {
                                                    String A9f = A9f();
                                                    return C02180Ae.A0I(A9f == null ? null : new File(A9f));
                                                }
                                            };
                                        } else {
                                            interfaceC52102a42 = new C3BK(this.A06, this.A07, this.A08, j2, A00.getPosition(), A01(j2), string2, string3, j3, j4) { // from class: X.3KQ
                                                public static final AnonymousClass015 A01 = new AnonymousClass015(1, 20, 2000, true);
                                                public final C2AQ A00;

                                                @Override // X.InterfaceC52102a4
                                                public int getType() {
                                                    return 1;
                                                }

                                                {
                                                    this.A00 = r13;
                                                }

                                                @Override // X.InterfaceC52102a4
                                                public Bitmap AVV(int i3) {
                                                    Bitmap A0K;
                                                    C2AQ c2aq = this.A00;
                                                    AnonymousClass015 anonymousClass015 = A01;
                                                    AnonymousClass011 anonymousClass011 = c2aq.A00;
                                                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                                    String A9f = A9f();
                                                    if (i3 < 144) {
                                                        A0K = C02180Ae.A0K(A9f == null ? null : new File(A9f), new C40821sv(96));
                                                    } else {
                                                        A0K = C02180Ae.A0K(A9f == null ? null : new File(A9f), new C40821sv(512));
                                                    }
                                                    if (atomicBoolean.compareAndSet(false, true)) {
                                                        C36621l6 c36621l6 = new C36621l6();
                                                        c36621l6.A00 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                                                        c36621l6.A02 = "gallerypicker/video/thumb";
                                                        c36621l6.A01 = null;
                                                        anonymousClass011.A0B(c36621l6, anonymousClass015, false);
                                                        return A0K;
                                                    }
                                                    StringBuilder sb = new StringBuilder("PerfTimer(");
                                                    sb.append("gallerypicker/video/thumb");
                                                    sb.append(") already stopped");
                                                    C000700j.A08(false, sb.toString());
                                                    return A0K;
                                                }

                                                @Override // X.C3BK
                                                public boolean equals(Object obj) {
                                                    return (obj instanceof C3KQ) && this.A04.equals(((C3BK) obj).A04);
                                                }

                                                @Override // X.C3BK
                                                public int hashCode() {
                                                    return this.A04.toString().hashCode();
                                                }

                                                @Override // X.C3BK
                                                public String toString() {
                                                    StringBuilder A0P = C000200d.A0P("VideoObject");
                                                    A0P.append(this.A02);
                                                    return A0P.toString();
                                                }
                                            };
                                        }
                                    } else {
                                        if ("image/gif".equals(string3) && file2 != null && C40841sx.A0i(file2)) {
                                            try {
                                                try {
                                                } catch (OutOfMemoryError e) {
                                                    Log.e("LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/OutOfMemory", e);
                                                }
                                                if (!(!C40851sy.A03(file2).A02)) {
                                                    C001200o c001200o2 = this.A06;
                                                    A00.getPosition();
                                                    interfaceC52102a42 = new C3BK(c001200o2, j2, A01(j2), string2, string3, j3, j4) { // from class: X.3KL
                                                        @Override // X.InterfaceC52102a4
                                                        public int getType() {
                                                            return 2;
                                                        }

                                                        @Override // X.InterfaceC52102a4
                                                        public Bitmap AVV(int i3) {
                                                            String A9f = A9f();
                                                            return C02180Ae.A0I(A9f == null ? null : new File(A9f));
                                                        }
                                                    };
                                                }
                                            } catch (IOException e2) {
                                                Log.e("LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/IOException", e2);
                                            }
                                        }
                                        interfaceC52102a42 = new C3BK(this.A06, this.A08, j2, A00.getPosition(), A01(j2), string2, string3, j3, A00.getInt(6), j4) { // from class: X.3KN
                                            public static final String[] A01 = {"_id", "width", "height"};
                                            public final int A00;

                                            @Override // X.InterfaceC52102a4
                                            public int getType() {
                                                return 0;
                                            }

                                            {
                                                this.A00 = r23;
                                            }

                                            public static Bitmap A00(Bitmap bitmap, int i3) {
                                                if (i3 != 0) {
                                                    Matrix matrix = new Matrix();
                                                    matrix.setRotate(i3, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                                                    try {
                                                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                        if (bitmap != createBitmap) {
                                                            bitmap.recycle();
                                                            return createBitmap;
                                                        }
                                                    } catch (OutOfMemoryError unused) {
                                                    }
                                                }
                                                return bitmap;
                                            }

                                            @Override // X.InterfaceC52102a4
                                            public Bitmap AVV(int i3) {
                                                ContentResolver contentResolver;
                                                boolean z;
                                                Bitmap A012;
                                                Bitmap bitmap = null;
                                                boolean z2 = false;
                                                if (i3 < 144) {
                                                    try {
                                                        long j5 = this.A02;
                                                        C61002vR A002 = C61002vR.A00();
                                                        contentResolver = this.A03;
                                                        z = false;
                                                        A012 = A002.A01(contentResolver, j5, 3, null);
                                                    } catch (Throwable th) {
                                                        Log.e("miniThumbBitmap got exception", th);
                                                        return null;
                                                    }
                                                } else {
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    options.inDither = false;
                                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                                    if (Build.VERSION.SDK_INT <= 18) {
                                                        options.inInputShareable = true;
                                                        options.inPurgeable = true;
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    contentResolver = this.A03;
                                                    long j6 = this.A02;
                                                    Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j6, 1, A01);
                                                    if (queryMiniThumbnail != null) {
                                                        try {
                                                            if (queryMiniThumbnail.moveToFirst()) {
                                                                long j7 = i3;
                                                                options.inSampleSize = C43981yK.A00(queryMiniThumbnail.getInt(1), queryMiniThumbnail.getInt(2), i3, j7 * j7 * 2);
                                                            }
                                                        } catch (Throwable th2) {
                                                            try {
                                                                throw th2;
                                                            } finally {
                                                                try {
                                                                    queryMiniThumbnail.close();
                                                                } catch (Throwable unused) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (queryMiniThumbnail != null) {
                                                    }
                                                    try {
                                                        A012 = C61002vR.A00().A01(contentResolver, j6, 1, options);
                                                    } catch (Throwable th3) {
                                                        Log.e("miniThumbBitmap got exception", th3);
                                                        return null;
                                                    }
                                                }
                                                if (A012 == null) {
                                                    long j8 = i3;
                                                    long j9 = j8 * j8 * 2;
                                                    Uri uri = this.A04;
                                                    if (uri != null) {
                                                        try {
                                                            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                                                            Bitmap A03 = C43981yK.A03(i3, j9, openFileDescriptor);
                                                            if (openFileDescriptor != null) {
                                                                openFileDescriptor.close();
                                                            }
                                                            bitmap = A03;
                                                        } catch (IOException | IllegalArgumentException | NullPointerException unused2) {
                                                        }
                                                        if (bitmap != null) {
                                                            A012 = A00(bitmap, this.A00);
                                                        } else {
                                                            A012 = bitmap;
                                                        }
                                                    } else {
                                                        throw null;
                                                    }
                                                }
                                                int i4 = this.A00;
                                                if (Build.VERSION.SDK_INT < 29 && A012 != null && i4 != 0) {
                                                    A012 = A00(A012, i4);
                                                } else {
                                                    z2 = z;
                                                }
                                                return (A012 == null || z2 || !C0JO.A00()) ? A012 : C0DD.A06(A012);
                                            }
                                        };
                                    }
                                }
                            } else {
                                long j5 = A00.getLong(0);
                                String string4 = A00.getString(1);
                                long j6 = A00.getLong(2);
                                if (j6 == 0) {
                                    j6 = A00.getLong(7) * 1000;
                                }
                                interfaceC52102a42 = new C3BK(this.A06, this.A08, j5, A00.getPosition(), A01(j5), string4, A00.getString(6), j6, A00.getInt(4), A00.getLong(8)) { // from class: X.3KN
                                    public static final String[] A01 = {"_id", "width", "height"};
                                    public final int A00;

                                    @Override // X.InterfaceC52102a4
                                    public int getType() {
                                        return 0;
                                    }

                                    {
                                        this.A00 = r23;
                                    }

                                    public static Bitmap A00(Bitmap bitmap, int i3) {
                                        if (i3 != 0) {
                                            Matrix matrix = new Matrix();
                                            matrix.setRotate(i3, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                                            try {
                                                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                if (bitmap != createBitmap) {
                                                    bitmap.recycle();
                                                    return createBitmap;
                                                }
                                            } catch (OutOfMemoryError unused) {
                                            }
                                        }
                                        return bitmap;
                                    }

                                    @Override // X.InterfaceC52102a4
                                    public Bitmap AVV(int i3) {
                                        ContentResolver contentResolver;
                                        boolean z;
                                        Bitmap A012;
                                        Bitmap bitmap = null;
                                        boolean z2 = false;
                                        if (i3 < 144) {
                                            try {
                                                long j52 = this.A02;
                                                C61002vR A002 = C61002vR.A00();
                                                contentResolver = this.A03;
                                                z = false;
                                                A012 = A002.A01(contentResolver, j52, 3, null);
                                            } catch (Throwable th) {
                                                Log.e("miniThumbBitmap got exception", th);
                                                return null;
                                            }
                                        } else {
                                            BitmapFactory.Options options = new BitmapFactory.Options();
                                            options.inDither = false;
                                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                            if (Build.VERSION.SDK_INT <= 18) {
                                                options.inInputShareable = true;
                                                options.inPurgeable = true;
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            contentResolver = this.A03;
                                            long j62 = this.A02;
                                            Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j62, 1, A01);
                                            if (queryMiniThumbnail != null) {
                                                try {
                                                    if (queryMiniThumbnail.moveToFirst()) {
                                                        long j7 = i3;
                                                        options.inSampleSize = C43981yK.A00(queryMiniThumbnail.getInt(1), queryMiniThumbnail.getInt(2), i3, j7 * j7 * 2);
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        throw th2;
                                                    } finally {
                                                        try {
                                                            queryMiniThumbnail.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            }
                                            if (queryMiniThumbnail != null) {
                                            }
                                            try {
                                                A012 = C61002vR.A00().A01(contentResolver, j62, 1, options);
                                            } catch (Throwable th3) {
                                                Log.e("miniThumbBitmap got exception", th3);
                                                return null;
                                            }
                                        }
                                        if (A012 == null) {
                                            long j8 = i3;
                                            long j9 = j8 * j8 * 2;
                                            Uri uri = this.A04;
                                            if (uri != null) {
                                                try {
                                                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                                                    Bitmap A03 = C43981yK.A03(i3, j9, openFileDescriptor);
                                                    if (openFileDescriptor != null) {
                                                        openFileDescriptor.close();
                                                    }
                                                    bitmap = A03;
                                                } catch (IOException | IllegalArgumentException | NullPointerException unused2) {
                                                }
                                                if (bitmap != null) {
                                                    A012 = A00(bitmap, this.A00);
                                                } else {
                                                    A012 = bitmap;
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                        int i4 = this.A00;
                                        if (Build.VERSION.SDK_INT < 29 && A012 != null && i4 != 0) {
                                            A012 = A00(A012, i4);
                                        } else {
                                            z2 = z;
                                        }
                                        return (A012 == null || z2 || !C0JO.A00()) ? A012 : C0DD.A06(A012);
                                    }
                                };
                            }
                        } else {
                            long j7 = A00.getLong(0);
                            String string5 = A00.getString(1);
                            long j8 = A00.getLong(2);
                            if (j8 == 0) {
                                j8 = A00.getLong(7) * 1000;
                            }
                            interfaceC52102a42 = new C3BK(this.A06, this.A08, j7, A00.getPosition(), A01(j7), string5, A00.getString(6), j8, A00.getInt(4), A00.getLong(8)) { // from class: X.3KN
                                public static final String[] A01 = {"_id", "width", "height"};
                                public final int A00;

                                @Override // X.InterfaceC52102a4
                                public int getType() {
                                    return 0;
                                }

                                {
                                    this.A00 = r23;
                                }

                                public static Bitmap A00(Bitmap bitmap, int i3) {
                                    if (i3 != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.setRotate(i3, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                                        try {
                                            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                            if (bitmap != createBitmap) {
                                                bitmap.recycle();
                                                return createBitmap;
                                            }
                                        } catch (OutOfMemoryError unused) {
                                        }
                                    }
                                    return bitmap;
                                }

                                @Override // X.InterfaceC52102a4
                                public Bitmap AVV(int i3) {
                                    ContentResolver contentResolver;
                                    boolean z;
                                    Bitmap A012;
                                    Bitmap bitmap = null;
                                    boolean z2 = false;
                                    if (i3 < 144) {
                                        try {
                                            long j52 = this.A02;
                                            C61002vR A002 = C61002vR.A00();
                                            contentResolver = this.A03;
                                            z = false;
                                            A012 = A002.A01(contentResolver, j52, 3, null);
                                        } catch (Throwable th) {
                                            Log.e("miniThumbBitmap got exception", th);
                                            return null;
                                        }
                                    } else {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inDither = false;
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        if (Build.VERSION.SDK_INT <= 18) {
                                            options.inInputShareable = true;
                                            options.inPurgeable = true;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        contentResolver = this.A03;
                                        long j62 = this.A02;
                                        Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j62, 1, A01);
                                        if (queryMiniThumbnail != null) {
                                            try {
                                                if (queryMiniThumbnail.moveToFirst()) {
                                                    long j72 = i3;
                                                    options.inSampleSize = C43981yK.A00(queryMiniThumbnail.getInt(1), queryMiniThumbnail.getInt(2), i3, j72 * j72 * 2);
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } finally {
                                                    try {
                                                        queryMiniThumbnail.close();
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                        }
                                        if (queryMiniThumbnail != null) {
                                        }
                                        try {
                                            A012 = C61002vR.A00().A01(contentResolver, j62, 1, options);
                                        } catch (Throwable th3) {
                                            Log.e("miniThumbBitmap got exception", th3);
                                            return null;
                                        }
                                    }
                                    if (A012 == null) {
                                        long j82 = i3;
                                        long j9 = j82 * j82 * 2;
                                        Uri uri = this.A04;
                                        if (uri != null) {
                                            try {
                                                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                                                Bitmap A03 = C43981yK.A03(i3, j9, openFileDescriptor);
                                                if (openFileDescriptor != null) {
                                                    openFileDescriptor.close();
                                                }
                                                bitmap = A03;
                                            } catch (IOException | IllegalArgumentException | NullPointerException unused2) {
                                            }
                                            if (bitmap != null) {
                                                A012 = A00(bitmap, this.A00);
                                            } else {
                                                A012 = bitmap;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                    int i4 = this.A00;
                                    if (Build.VERSION.SDK_INT < 29 && A012 != null && i4 != 0) {
                                        A012 = A00(A012, i4);
                                    } else {
                                        z2 = z;
                                    }
                                    return (A012 == null || z2 || !C0JO.A00()) ? A012 : C0DD.A06(A012);
                                }
                            };
                        }
                    } else {
                        long j9 = A00.getLong(0);
                        String string6 = A00.getString(1);
                        long j10 = A00.getLong(2);
                        if (j10 == 0) {
                            j10 = A00.getLong(6) * 1000;
                        }
                        String string7 = A00.getString(5);
                        long j11 = A00.getLong(7);
                        if (string6 != null && GifHelper.A02(new File(string6))) {
                            C001200o c001200o3 = this.A06;
                            A00.getPosition();
                            interfaceC52102a42 = new C3BK(c001200o3, j9, A01(j9), string6, string7, j10, j11) { // from class: X.3KL
                                @Override // X.InterfaceC52102a4
                                public int getType() {
                                    return 2;
                                }

                                @Override // X.InterfaceC52102a4
                                public Bitmap AVV(int i3) {
                                    String A9f = A9f();
                                    return C02180Ae.A0I(A9f == null ? null : new File(A9f));
                                }
                            };
                        } else {
                            interfaceC52102a42 = new C3BK(this.A06, this.A07, this.A08, j9, A00.getPosition(), A01(j9), string6, string7, j10, j11) { // from class: X.3KQ
                                public static final AnonymousClass015 A01 = new AnonymousClass015(1, 20, 2000, true);
                                public final C2AQ A00;

                                @Override // X.InterfaceC52102a4
                                public int getType() {
                                    return 1;
                                }

                                {
                                    this.A00 = r13;
                                }

                                @Override // X.InterfaceC52102a4
                                public Bitmap AVV(int i3) {
                                    Bitmap A0K;
                                    C2AQ c2aq = this.A00;
                                    AnonymousClass015 anonymousClass015 = A01;
                                    AnonymousClass011 anonymousClass011 = c2aq.A00;
                                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    String A9f = A9f();
                                    if (i3 < 144) {
                                        A0K = C02180Ae.A0K(A9f == null ? null : new File(A9f), new C40821sv(96));
                                    } else {
                                        A0K = C02180Ae.A0K(A9f == null ? null : new File(A9f), new C40821sv(512));
                                    }
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        C36621l6 c36621l6 = new C36621l6();
                                        c36621l6.A00 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                                        c36621l6.A02 = "gallerypicker/video/thumb";
                                        c36621l6.A01 = null;
                                        anonymousClass011.A0B(c36621l6, anonymousClass015, false);
                                        return A0K;
                                    }
                                    StringBuilder sb = new StringBuilder("PerfTimer(");
                                    sb.append("gallerypicker/video/thumb");
                                    sb.append(") already stopped");
                                    C000700j.A08(false, sb.toString());
                                    return A0K;
                                }

                                @Override // X.C3BK
                                public boolean equals(Object obj) {
                                    return (obj instanceof C3KQ) && this.A04.equals(((C3BK) obj).A04);
                                }

                                @Override // X.C3BK
                                public int hashCode() {
                                    return this.A04.toString().hashCode();
                                }

                                @Override // X.C3BK
                                public String toString() {
                                    StringBuilder A0P = C000200d.A0P("VideoObject");
                                    A0P.append(this.A02);
                                    return A0P.toString();
                                }
                            };
                        }
                    }
                    if (interfaceC52102a42 != null) {
                        c06f.A08(valueOf, interfaceC52102a42);
                    }
                }
            }
            return interfaceC52102a42;
        }
        return interfaceC52102a4;
    }

    @Override // X.InterfaceC52142a8
    public void ARb() {
        Cursor cursor;
        if ((this instanceof C3KG) && (cursor = this.A00) != null) {
            cursor.deactivate();
            this.A01 = true;
        }
    }

    @Override // X.InterfaceC52142a8
    public void close() {
        try {
            Cursor cursor = this.A00;
            if (cursor != null) {
                cursor.deactivate();
                this.A01 = true;
            }
        } catch (IllegalStateException e) {
            Log.e("medialist/exception while deactivating cursor", e);
        }
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.close();
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC52142a8
    public int getCount() {
        int count;
        Cursor A00 = A00();
        if (A00 == null) {
            return 0;
        }
        synchronized (this) {
            count = A00.getCount();
        }
        return count;
    }

    @Override // X.InterfaceC52142a8
    public boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // X.InterfaceC52142a8
    public void registerContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof C3KG) && (cursor = this.A00) != null) {
            cursor.registerContentObserver(contentObserver);
        }
    }

    @Override // X.InterfaceC52142a8
    public void unregisterContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof C3KG) && (cursor = this.A00) != null) {
            cursor.unregisterContentObserver(contentObserver);
        }
    }
}
