package X;

import android.net.Uri;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.1vb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42351vb {
    public static final Comparator A02 = new Comparator() { // from class: X.3Xy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj).getName().substring(0, 2).compareTo(((File) obj2).getName().substring(0, 2));
        }
    };
    public static volatile C42351vb A03;
    public final C012005w A00;
    public final C2CH A01;

    public C42351vb(C012005w c012005w, C2CH c2ch) {
        this.A00 = c012005w;
        this.A01 = c2ch;
    }

    public static C42351vb A00() {
        if (A03 == null) {
            synchronized (C42351vb.class) {
                if (A03 == null) {
                    A03 = new C42351vb(C012005w.A00(), new C2CH(C001200o.A01.A00));
                }
            }
        }
        return A03;
    }

    public final File A01(String str, String str2) {
        C012005w c012005w = this.A00;
        if (c012005w != null) {
            File file = new File(c012005w.A03.A00.getCacheDir(), "stickers_cache");
            AbstractC012105x.A03(file, false);
            StringBuilder sb = new StringBuilder();
            sb.append(Uri.encode(str));
            sb.append(File.separatorChar);
            sb.append(Uri.encode(str2));
            return new File(file, sb.toString());
        }
        throw null;
    }

    public synchronized void A02(String str, String str2, List list) {
        String obj;
        C2CH c2ch;
        Uri parse;
        InputStream inputStream;
        if (list.size() < 100) {
            File A01 = A01(str, str2);
            AnonymousClass024.A0S(A01);
            if (!A01.exists() && !A01.mkdirs()) {
                A01.getAbsolutePath();
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                C0JM c0jm = (C0JM) list.get(i);
                String str3 = c0jm.A0B;
                if (i < 100) {
                    if (i < 10) {
                        StringBuilder A0Q = C000200d.A0Q("0", i, "_");
                        A0Q.append(Uri.encode(str3));
                        A0Q.append(".webp");
                        obj = A0Q.toString();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        sb.append("_");
                        sb.append(Uri.encode(str3));
                        sb.append(".webp");
                        obj = sb.toString();
                    }
                    File file = new File(A01, obj);
                    try {
                        c2ch = this.A01;
                        parse = Uri.parse(c0jm.A08);
                        inputStream = null;
                    } catch (IOException e) {
                        Log.e("error closing the input stream.", e);
                    }
                    if (c2ch != null) {
                        try {
                            inputStream = c2ch.A00.getContentResolver().openInputStream(parse);
                            if (inputStream != null) {
                                try {
                                    if (AnonymousClass024.A0i(inputStream, file)) {
                                        if (c0jm.A04 != null) {
                                            WebpUtils.A01(file, c0jm.A04.A01());
                                        }
                                        file.getAbsolutePath();
                                        inputStream.close();
                                    }
                                } finally {
                                }
                            }
                        } catch (FileNotFoundException e2) {
                            Log.e("error openUri", e2);
                        }
                        AnonymousClass024.A0S(A01);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return;
                    }
                    throw null;
                }
                throw new IllegalStateException(C000200d.A0D("ThirdPartyStickerStorage/createStickerFileName/sticker index is more more than 100. Index: ", i));
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ThirdPartyStickerStorage/addStickersInPack/total amount of stickers in pack is more than 100, size: ");
        sb2.append(list.size());
        throw new IllegalStateException(sb2.toString());
    }
}
