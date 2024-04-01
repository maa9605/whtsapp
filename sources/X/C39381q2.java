package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: X.1q2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39381q2 extends AbstractC30211a6 {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C39381q2(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        return this.A02;
    }

    @Override // X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        try {
            Uri uri = anonymousClass126.A05;
            this.A02 = uri;
            A01();
            AssetFileDescriptor openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, "r");
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.A03 = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                FileInputStream fileInputStream = this.A03;
                long j = anonymousClass126.A04;
                long skip = fileInputStream.skip(j + startOffset) - startOffset;
                if (skip == j) {
                    long j2 = anonymousClass126.A03;
                    if (j2 != -1) {
                        this.A00 = j2;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            this.A00 = size != 0 ? size - channel.position() : -1L;
                        } else {
                            this.A00 = length - skip;
                        }
                    }
                    this.A04 = true;
                    A03(anonymousClass126);
                    return this.A00;
                }
                throw new EOFException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open file descriptor for: ");
            sb.append(this.A02);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new AnonymousClass123(e);
        }
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        this.A02 = null;
        try {
            try {
                FileInputStream fileInputStream = this.A03;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new AnonymousClass123(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        A00();
                    }
                }
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.A01;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            A00();
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new AnonymousClass123(e2);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        A00();
                    }
                }
            }
        } catch (IOException e3) {
            throw new AnonymousClass123(e3);
        }
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AnonymousClass123(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new AnonymousClass123(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - read;
        }
        A02(read);
        return read;
    }
}
