/*
 * Copyright © 2025 Eduardo Vindas Cordoba. All rights reserved.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.aeongames.edi.utils.common;

/**
 * this Enumeration class is designed to define the Data Sizes from Byte to Exabyte
 * the general idea is for convert data and having a convenient way to count and 
 * redundantly enumerate them. 
 *
 * @author Eduardo Vindas C
 * @version 2
 */
public enum DataSizes {
    //a zebibyte cannot be represented by this class as it require a 2 to the power of 70 and long cannot represent this value. 
    //but this is not a concern at this point of time. exa and peta are alredy too large for most cases. 
    Exabyte("Exabytes", "EB", 1_000_000_000_000_000_000L, 1_152_921_504_606_846_976L),
    Petabyte("Petabytes", "PB", 1_000_000_000_000_000L, 1_125_899_906_842_624L),
    Terabyte("Terabytes", "TB", 1_000_000_000_000L, 1_099_511_627_776L),
    Gigabyte("Gigabytes", "GB", 1000_000_000L, 1_073_741_824L),
    Megabyte("Megabytes", "MB", 1_000_000L, 1_048_576L),
    Kilobyte("Kilobytes", "KB", 1000L, 1024L),
    bytee("bytes", "B", 1L, 1L);

    /**
     * the name of this Data Size. 
     */
    private final String Name;
    /**
     * the suffix of this data size. i.e "kb, mb" etc. "
     */
    private final String Suffix;
    /**
     * the decimal amount that represent the &quot;size&quot; this number is
     * loss. but represent the closest &quot;decimal&quot;
     */
    private final long DecSize;
    /**
     * the amount of bytes of this data size.
     */
    private final long Bytes;

    /**
     * creates the Enumeration with its own properties.
     * @param value the decimal representation of this data size
     * @param bibytes the amount of bytes that represent this data size
     * @param name the Size name
     * @param suff the suffix of this data size
     */
    private DataSizes(String name, String suff, long value, long bibytes) {
        DecSize = value;
        Name = name;
        Suffix = suff;
        Bytes = bibytes;
    }

    /**
     * returns the amount of bytes that represent this data size.
     *
     * @return the amount of bytes
     */
    public long size() {
        return Bytes;
    }

    /**
     * returns the decimal amount that represent this data size
     * @return the decimal amount that represent this data size.
     */
    public long getNumericSize() {
        return DecSize;
    }

    /**
     * get the Name of this size
     *
     * @return a String that represent the Name of this data size
     */
    public String getName() {
        return Name;
    }

    /**
     * returns the suffix of this data size
     *
     * @return a String that represent the suffix for this data size
     */
    public String getSuffix() {
        return Suffix;
    }
}
