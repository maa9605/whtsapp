package com.whatsapp.contentprovider;

import X.AbstractC000600i;
import X.AbstractC40391s9;
import X.AnonymousClass012;
import X.AnonymousClass097;
import X.C000200d;
import X.C002301c;
import X.C012005w;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C02C;
import X.C05W;
import X.C09H;
import X.C0C9;
import X.C0CA;
import X.C0CD;
import X.C0CE;
import X.C0CF;
import X.C0CG;
import X.C0CH;
import X.C0CI;
import X.C40411sD;
import X.C40421sE;
import X.InterfaceC002901k;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes2.dex */
public class MediaProvider extends AbstractC40391s9 {
    public static UriMatcher A0A;
    public static final String A0B = C000200d.A0I("vnd.android.cursor.dir/vnd.", "com.whatsapp", ".provider.media.buckets");
    public static final String A0C = C000200d.A0I("vnd.android.cursor.dir/vnd.", "com.whatsapp", ".provider.media.items");
    public static final String[] A0D = {"_display_name", "_size"};
    public C012005w A00;
    public C05W A01;
    public C018708s A02;
    public AnonymousClass012 A03;
    public C002301c A04;
    public C0CA A05;
    public C0C9 A06;
    public C40411sD A07;
    public C40421sE A08;
    public C02C A09;

    public static int A00(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(C000200d.A0H("Invalid mode: ", str));
    }

    public static synchronized UriMatcher A01() {
        UriMatcher uriMatcher;
        synchronized (MediaProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.media", "buckets", 1);
                A0A.addURI("com.whatsapp.provider.media", "items", 2);
                A0A.addURI("com.whatsapp.provider.media", "item/*", 3);
                A0A.addURI("com.whatsapp.provider.media", "gdpr_report", 4);
                A0A.addURI("com.whatsapp.provider.media", "dyi_report", 6);
                A0A.addURI("com.whatsapp.provider.media", "business_activity_report", 7);
                A0A.addURI("com.whatsapp.provider.media", "export_chat/*/*", 5);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    public static Uri A02(AbstractC000600i abstractC000600i, C40421sE c40421sE, AnonymousClass097 anonymousClass097) {
        String name;
        if (Build.VERSION.SDK_INT < 21) {
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                return Uri.fromFile(c09h.A0F);
            }
            throw null;
        }
        C09H c09h2 = anonymousClass097.A02;
        if (c09h2 != null) {
            File file = c09h2.A0F;
            if (file != null) {
                String obj = UUID.randomUUID().toString();
                if (anonymousClass097.A0m == 9 && !TextUtils.isEmpty(anonymousClass097.A1B())) {
                    name = anonymousClass097.A1B();
                } else {
                    name = file.getName();
                }
                String absolutePath = file.getAbsolutePath();
                String A03 = C018608r.A03(abstractC000600i, anonymousClass097);
                C0CD A01 = c40421sE.A01.A01();
                try {
                    C0CF A0B2 = A01.A02.A0B("INSERT INTO shared_media_ids (item_uuid, file_name, mime_type, display_name, expiration_timestamp) VALUES (?, ?, ?, ?, ?)");
                    SQLiteStatement sQLiteStatement = A0B2.A00;
                    sQLiteStatement.bindString(1, obj);
                    sQLiteStatement.bindString(2, absolutePath);
                    sQLiteStatement.bindString(3, A03);
                    if (name == null) {
                        A0B2.A02(4);
                    } else {
                        A0B2.A05(4, name);
                    }
                    if (c40421sE.A00 != null) {
                        sQLiteStatement.bindString(5, String.valueOf(System.currentTimeMillis() + 3600000));
                        A0B2.A01();
                        A01.close();
                        return new Uri.Builder().scheme("content").authority("com.whatsapp.provider.media").appendPath("item").appendEncodedPath(obj).build();
                    }
                    throw null;
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public static Uri A03(String str, String str2) {
        return new Uri.Builder().scheme("content").authority("com.whatsapp.provider.media").appendPath(str).appendQueryParameter("id", str2).build();
    }

    public static final String A04(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new IllegalArgumentException(C000200d.A0G("Unknown URI ", uri));
    }

    public static void A05(C018508q c018508q, final AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, final C40421sE c40421sE, final AnonymousClass097 anonymousClass097, C0CG c0cg) {
        C0CH c0ch = new C0CH() { // from class: X.1sI
            @Override // X.C0CH
            public Object A04() {
                return MediaProvider.A02(AbstractC000600i.this, c40421sE, anonymousClass097);
            }
        };
        ((C0CI) c0ch).A01.A03(c0cg, c018508q.A06);
        interfaceC002901k.AS1(c0ch);
    }

    public final Cursor A06(File file, String str, Uri uri, String[] strArr) {
        int i;
        try {
            A08(uri, file);
            if (strArr == null) {
                strArr = A0D;
            }
            int length = strArr.length;
            String[] strArr2 = new String[length];
            Object[] objArr = new Object[length];
            int i2 = 0;
            for (String str2 : strArr) {
                if ("_display_name".equals(str2)) {
                    strArr2[i2] = "_display_name";
                    i = i2 + 1;
                    objArr[i2] = str;
                } else if ("_size".equals(str2)) {
                    strArr2[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(file.length());
                }
                i2 = i;
            }
            String[] strArr3 = new String[i2];
            System.arraycopy(strArr2, 0, strArr3, 0, i2);
            Object[] objArr2 = new Object[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
            matrixCursor.addRow(objArr2);
            return matrixCursor;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final File A07(Uri uri) {
        String str;
        C40421sE c40421sE = this.A08;
        String lastPathSegment = uri.getLastPathSegment();
        C0CD c0cd = new C0CD(null, c40421sE.A01, false);
        try {
            C0CE c0ce = c0cd.A02;
            String[] strArr = new String[2];
            strArr[0] = lastPathSegment;
            if (c40421sE.A00 != null) {
                strArr[1] = String.valueOf(System.currentTimeMillis());
                Cursor A07 = c0ce.A07("SELECT file_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", strArr);
                if (A07 == null || !A07.moveToNext()) {
                    if (A07 != null) {
                        A07.close();
                    }
                    c0cd.close();
                    str = null;
                } else {
                    str = A07.getString(A07.getColumnIndex("file_name"));
                    A07.close();
                    c0cd.close();
                }
                if (str != null) {
                    return new File(str);
                }
                return null;
            }
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final void A08(Uri uri, File file) {
        if (file.exists()) {
            if (file.lastModified() >= this.A03.A05() - 3600000) {
                return;
            }
            file.delete();
            throw new FileNotFoundException(C000200d.A0G("File expired for uri: ", uri));
        }
        throw new FileNotFoundException(C000200d.A0G("File not found for uri: ", uri));
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r2 != null) goto L17;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getType(android.net.Uri r10) {
        /*
            r9 = this;
            android.content.UriMatcher r0 = A01()
            int r0 = r0.match(r10)
            switch(r0) {
                case 1: goto L7c;
                case 2: goto L79;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L1a;
                case 7: goto L1a;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "Unknown URI "
            java.lang.String r1 = X.C000200d.A0G(r0, r10)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L17:
            java.lang.String r0 = "text/plain"
            return r0
        L1a:
            java.lang.String r0 = "application/zip"
            return r0
        L1d:
            X.1sE r8 = r9.A08
            java.lang.String r3 = r10.getLastPathSegment()
            X.1sH r2 = r8.A01
            r1 = 0
            r0 = 0
            X.0CD r4 = new X.0CD
            r4.<init>(r1, r2, r0)
            X.0CE r7 = r4.A02     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = "SELECT mime_type FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L72
            r0 = 0
            r5[r0] = r3     // Catch: java.lang.Throwable -> L72
            r3 = 1
            X.02N r1 = r8.A00     // Catch: java.lang.Throwable -> L72
            r0 = 0
            if (r1 == 0) goto L71
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L72
            r5[r3] = r1     // Catch: java.lang.Throwable -> L72
            android.database.Cursor r2 = r7.A07(r6, r5)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L64
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L64
            java.lang.String r0 = "mime_type"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L5d
            goto L66
        L5d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L63
        L63:
            throw r0     // Catch: java.lang.Throwable -> L72
        L64:
            if (r2 == 0) goto L69
        L66:
            r2.close()     // Catch: java.lang.Throwable -> L72
        L69:
            r4.close()
            if (r0 != 0) goto L70
            java.lang.String r0 = "application/octet-stream"
        L70:
            return r0
        L71:
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L78
        L78:
            throw r0
        L79:
            java.lang.String r0 = com.whatsapp.contentprovider.MediaProvider.A0C
            return r0
        L7c:
            java.lang.String r0 = com.whatsapp.contentprovider.MediaProvider.A0B
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.getType(android.net.Uri):java.lang.String");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int match = A01().match(uri);
        if (match == 3) {
            int A00 = A00(str);
            File A07 = A07(uri);
            if (A07 != null) {
                try {
                    this.A09.A06(A07);
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(A07, A00);
                    try {
                        this.A09.A04(open);
                        return open;
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder("mediaprovider/ parcel file descriptor is not external for uri: ");
                        sb.append(uri);
                        Log.e(sb.toString(), e);
                        throw new FileNotFoundException();
                    }
                } catch (IOException e2) {
                    StringBuilder sb2 = new StringBuilder("mediaprovider/ file is not external for uri: ");
                    sb2.append(uri);
                    Log.e(sb2.toString(), e2);
                    throw new FileNotFoundException();
                }
            }
            StringBuilder sb3 = new StringBuilder("mediaprovider/openMessageFile no file found for uri: ");
            sb3.append(uri);
            Log.e(sb3.toString());
            throw new FileNotFoundException();
        } else if (match == 4) {
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter != null) {
                File A0K = this.A00.A0K(queryParameter);
                A08(uri, A0K);
                return ParcelFileDescriptor.open(A0K, A00(str));
            }
            throw new FileNotFoundException(C000200d.A0G("File not found for uri: ", uri));
        } else if (match == 5) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                File A0H = this.A00.A0H(lastPathSegment);
                A08(uri, A0H);
                return ParcelFileDescriptor.open(A0H, A00(str));
            }
            throw new FileNotFoundException(C000200d.A0G("File not found for uri: ", uri));
        } else if (match == 6) {
            String queryParameter2 = uri.getQueryParameter("id");
            if (queryParameter2 != null) {
                File A0J = this.A00.A0J(queryParameter2);
                A08(uri, A0J);
                return ParcelFileDescriptor.open(A0J, A00(str));
            }
            throw new FileNotFoundException(C000200d.A0G("File not found for uri: ", uri));
        } else if (match == 7) {
            String queryParameter3 = uri.getQueryParameter("id");
            if (queryParameter3 != null) {
                File A0I = this.A00.A0I(queryParameter3);
                A08(uri, A0I);
                return ParcelFileDescriptor.open(A0I, A00(str));
            }
            throw new FileNotFoundException(C000200d.A0G("File not found for uri: ", uri));
        } else {
            throw new FileNotFoundException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
        if (r2 != null) goto L61;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.database.Cursor query(android.net.Uri r21, java.lang.String[] r22, java.lang.String r23, java.lang.String[] r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
