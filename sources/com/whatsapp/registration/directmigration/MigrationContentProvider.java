package com.whatsapp.registration.directmigration;

import X.AbstractC40391s9;
import X.AbstractC40441sG;
import X.AnonymousClass034;
import X.C000200d;
import X.C000500h;
import X.C012005w;
import X.C01B;
import X.C02F;
import X.C02L;
import X.C05E;
import X.C0CB;
import X.C0CC;
import X.C0FK;
import X.C0Fi;
import X.C40431sF;
import X.C42501vq;
import X.EnumC03450Ft;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class MigrationContentProvider extends AbstractC40391s9 {
    public static UriMatcher A0A;
    public static final List A0B;
    public C012005w A00;
    public C02L A01;
    public C01B A02;
    public AnonymousClass034 A03;
    public C02F A04;
    public C000500h A05;
    public C0CC A06;
    public C0CB A07;
    public AbstractC40441sG A08;
    public C40431sF A09;

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(new C0FK("push_name", 2), new C0FK("interface_gdrive_backup_frequency", 2), new C0FK("interface_gdrive_backup_network_setting", 2), new C0FK("gdrive_include_videos_in_backup", 1)));
        arrayList.addAll(C000500h.A01());
        A0B = Collections.unmodifiableList(arrayList);
    }

    public static synchronized UriMatcher A00() {
        UriMatcher uriMatcher;
        synchronized (MigrationContentProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.MigrationContentProvider", "msg_store", 1);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "wallpaper", 2);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_setting_store", 3);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "sticker_store", 4);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "share_preferences", 5);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "status_ranking_store", 6);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "media", 7);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r5.number.equals(r1) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (r11 == 268435456) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A01(android.net.Uri r10, int r11) {
        /*
            r9 = this;
            android.content.Context r4 = r9.getContext()
            if (r4 != 0) goto L8
            r0 = 7
            return r0
        L8:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r3 = r1.getNameForUid(r0)
            r8 = 1
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.RuntimeException -> L2b
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch: java.lang.RuntimeException -> L2b
            int r1 = r0.uid     // Catch: java.lang.RuntimeException -> L2b
            int r0 = android.os.Binder.getCallingUid()     // Catch: java.lang.RuntimeException -> L2b
            int r0 = r2.checkSignatures(r1, r0)     // Catch: java.lang.RuntimeException -> L2b
            r7 = 1
            if (r0 == 0) goto L3e
            goto L3d
        L2b:
            r2 = move-exception
            java.lang.String r1 = "FileSharingHelper/checkSameSignatureCaller. Error is : "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
        L3d:
            r7 = 0
        L3e:
            X.02L r0 = r9.A01
            r0.A05()
            com.whatsapp.Me r5 = r0.A00
            if (r5 == 0) goto L64
            java.lang.String r0 = "query_param_country_code"
            java.lang.String r2 = r10.getQueryParameter(r0)
            java.lang.String r0 = "query_param_phone_number"
            java.lang.String r1 = r10.getQueryParameter(r0)
            java.lang.String r0 = r5.cc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r5.number
            boolean r0 = r0.equals(r1)
            r6 = 1
            if (r0 != 0) goto L65
        L64:
            r6 = 0
        L65:
            java.lang.String r0 = "com.whatsapp.w4b"
            boolean r1 = r0.equals(r3)
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r0.equals(r3)
            if (r1 != 0) goto L76
            r5 = 0
            if (r0 == 0) goto L77
        L76:
            r5 = 1
        L77:
            if (r3 == 0) goto Lbc
            long r3 = X.AnonymousClass029.A0B(r4, r3)
            if (r1 == 0) goto Lb2
            r1 = 597(0x255, double:2.95E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lbc
        L85:
            r3 = 1
        L86:
            X.01B r1 = r9.A02
            X.03B r0 = X.C01C.A0Z
            boolean r2 = r1.A0E(r0)
            X.01B r0 = r9.A02
            if (r0 == 0) goto Lbe
            r0 = -1
            if (r11 == r0) goto L9a
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 0
            if (r11 != r1) goto L9b
        L9a:
            r0 = 1
        L9b:
            if (r2 == 0) goto La0
            if (r7 != 0) goto La1
            r8 = 2
        La0:
            return r8
        La1:
            if (r5 != 0) goto La5
            r8 = 3
            return r8
        La5:
            if (r3 != 0) goto La9
            r8 = 4
            return r8
        La9:
            if (r0 != 0) goto Lad
            r8 = 5
            return r8
        Lad:
            r8 = 0
            if (r6 != 0) goto La0
            r8 = 6
            return r8
        Lb2:
            if (r0 == 0) goto Lbc
            r1 = 452962(0x6e962, double:2.23793E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lbc
            goto L85
        Lbc:
            r3 = 0
            goto L86
        Lbe:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.A01(android.net.Uri, int):int");
    }

    public final File A02(String str) {
        if (!TextUtils.isEmpty(str) && this.A04.A06()) {
            File file = new File(this.A03.A03(), str);
            if (this.A00.A0R(file) && file.exists()) {
                return file;
            }
            return null;
        }
        return null;
    }

    public final void A03(File file, MatrixCursor matrixCursor, int i) {
        if (i == 0) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || (r4 = listFiles.length) == 0) {
            StringBuilder sb = new StringBuilder("MigrationContentProvider/fillMediaCursor/skipping folder ");
            sb.append(file);
            Log.i(sb.toString());
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                A03(file2, matrixCursor, i - 1);
            } else {
                matrixCursor.addRow(new String[]{file2.getAbsolutePath().replace(this.A03.A03().getAbsolutePath(), "")});
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        File A02;
        return (A01(uri, -1) == 0 && A00().match(uri) == 7 && (A02 = A02(uri.getQueryParameter("path"))) != null && A02.delete()) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (A01(uri, -1) != 0) {
            return null;
        }
        if (1 == A00().match(uri)) {
            try {
                Log.i("MigrationContentProvider/getType");
                File A0B2 = this.A06.A0B();
                if (A0B2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MigrationContentProvider/getType/msgstore-file-name = ");
                    sb.append(A0B2.getName());
                    Log.i(sb.toString());
                    return A0B2.getName();
                }
            } catch (Exception e) {
                Log.i("MigrationContentProvider/getType/exception = ", e);
            }
            return null;
        }
        throw new UnsupportedOperationException(C000200d.A0G("This operation is not supported ", uri));
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        String obj;
        File A02;
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C000200d.A0H("Invalid mode: ", str));
            } else {
                i = 1006632960;
            }
        } else {
            i = 738197504;
        }
        int A01 = A01(uri, i);
        int i2 = 0;
        if (A01 != 0) {
            switch (A01) {
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 10;
                    break;
                case 4:
                    i2 = 11;
                    break;
                case 5:
                    i2 = 12;
                    break;
                case 6:
                    i2 = 13;
                    break;
                case 7:
                    break;
                default:
                    throw new IllegalArgumentException("cannot convert granted to InitializationState");
            }
            throw new FileNotFoundException(String.valueOf(i2));
        }
        StringBuilder A0P = C000200d.A0P("MigrationContentProvider/openFile/");
        A0P.append(uri.getPath());
        Log.i(A0P.toString());
        int match = A00().match(uri);
        File file = null;
        if (match == 1) {
            C0CC c0cc = this.A06;
            C0Fi c0Fi = c0cc.A0V;
            synchronized (c0Fi) {
                c0Fi.A00 = true;
            }
            C05E c05e = c0cc.A0M;
            c05e.A05();
            if (c05e.A07.exists()) {
                Log.i("messageStoreBackup/getFileForMigration/backup-db");
                int A07 = c0cc.A07(null);
                C000200d.A1V(C000200d.A0P("messageStoreBackup/finish-backup-db-successful? = "), A07 == 0);
                if (A07 == 0) {
                    try {
                        File A0B2 = c0cc.A0B();
                        StringBuilder sb = new StringBuilder();
                        sb.append("messageStoreBackup/getFileForMigration/latest-backup-file");
                        sb.append(A0B2);
                        Log.i(sb.toString());
                        if (A0B2 != null) {
                            return ParcelFileDescriptor.open(A0B2, i);
                        }
                        return null;
                    } catch (IOException e) {
                        Log.e("messageStoreBackup/getFileForMigration/exception = ", e);
                        StringBuilder A0P2 = C000200d.A0P("messageStoreBackup/failed-to-get-backup-file");
                        A0P2.append(e.toString());
                        throw new FileNotFoundException(A0P2.toString());
                    }
                }
                StringBuilder A0Q = C000200d.A0Q("messageStoreBackup/getFileForMigration/backup-failed/backup-result = ", A07, " log = ");
                C0Fi c0Fi2 = c0cc.A0V;
                synchronized (c0Fi2) {
                    obj = c0Fi2.A01.toString();
                }
                A0Q.append(obj);
                throw new FileNotFoundException(A0Q.toString());
            }
            throw new FileNotFoundException("14");
        } else if (match == 2) {
            AbstractC40441sG abstractC40441sG = this.A08;
            if (!(abstractC40441sG instanceof C42501vq)) {
                A02 = AbstractC40441sG.A02(abstractC40441sG.A06.A00);
            } else {
                A02 = AbstractC40441sG.A02(((AbstractC40441sG) ((C42501vq) abstractC40441sG).A04).A06.A00);
            }
            if (A02 != null) {
                return ParcelFileDescriptor.open(A02, i);
            }
            return null;
        } else if (match == 3) {
            C0CB c0cb = this.A07;
            ReentrantReadWriteLock.WriteLock writeLock = c0cb.A09().A04.writeLock();
            writeLock.lock();
            try {
                File databasePath = c0cb.A0F.A00.getDatabasePath("chatsettings.db");
                if (databasePath.exists()) {
                    c0cb.A09().close();
                    writeLock.unlock();
                    file = databasePath;
                }
                if (file != null) {
                    return ParcelFileDescriptor.open(file, i);
                }
                return null;
            } finally {
                writeLock.unlock();
            }
        } else if (match == 4) {
            File A08 = this.A09.A08(EnumC03450Ft.UNENCRYPTED);
            if (A08 != null) {
                return ParcelFileDescriptor.open(A08, i);
            }
            return null;
        } else if (match == 6) {
            Log.w("MigrationContentProvider/openFile/st-rank not supported");
            return null;
        } else if (match == 7) {
            File A022 = A02(uri.getQueryParameter("path"));
            if (A022 != null) {
                return ParcelFileDescriptor.open(A022, i);
            }
            return null;
        } else {
            throw new IllegalArgumentException(C000200d.A0G("Unknown URI ", uri));
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        int A01 = A01(uri, -1);
        if (A01 != 0) {
            C000200d.A0r("MigrationContentProvider/query denied ", A01);
            return null;
        }
        int match = A00().match(uri);
        if (match != 5) {
            if (match == 7) {
                File A03 = this.A03.A03();
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"path"});
                if (this.A04.A06() && A03.exists()) {
                    A03(A03, matrixCursor, 4);
                }
                return matrixCursor;
            }
            throw new IllegalArgumentException(C000200d.A0G("Unknown URI ", uri));
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"key", "value", "valueType"});
        for (C0FK c0fk : A0B) {
            MatrixCursor.RowBuilder newRow = matrixCursor2.newRow();
            Object obj = c0fk.A00;
            newRow.add(obj);
            Object obj2 = c0fk.A01;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                if (obj != null) {
                    String str4 = (String) obj;
                    if (intValue != 0) {
                        if (intValue == 1) {
                            newRow.add(Integer.valueOf(this.A05.A00.getBoolean(str4, false) ? 1 : 0));
                        } else {
                            if (intValue != 2) {
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        throw new IllegalArgumentException("unexpected type");
                                    }
                                }
                            } else {
                                newRow.add(this.A05.A00.getString(str4, ""));
                            }
                            str3 = "string";
                        }
                        str3 = "boolean";
                    } else {
                        newRow.add(Integer.valueOf(this.A05.A00.getInt(str4, 0)));
                        str3 = "int";
                    }
                    newRow.add(str3);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return matrixCursor2;
    }
}
