/* 
 *  Copyright © 2025 Eduardo Vindas Cordoba. All rights reserved.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 * 
 */
package com.aeongames.edi.utils.datatransfer;

/**
 * The class {@code DataTransferException} is a form of {@code Exception} that 
 * indicates conditions that the clipboard fail to be open, read, or data changed
 * before we were able to use the data.and the Clipboard Service should stop and retry to access the clipboard.<p>
 * The class {@code DataTransferException} is an <em>checked exception</em>. 
 *
 * @author Eduardo Vindas
 * @see java.lang.Exception
 * @since 1.0
 */
public final class DataTransferException extends Exception {

    /**
     * Creates a new instance of <code>CliboardException</code> without detail
     * message.
     * @param Source the source that trigger this error. if any. 
     */
    public DataTransferException(Exception Source) {
        super(Source);
    }

    /**
     * Constructs an instance of <code>CliboardException</code> with the
     * specified detail message.
     *
     * @param Source the source that trigger this error. if any. 
     * @param msg the detail message.
     */
    public DataTransferException(Exception Source, String msg) {
        super(msg, Source);
    }

    /**
     * return the Exception that caused *this* one. 
     * if the cause is not an instance of Exception i.e was due a {@code Throwable}
     * then returns null 
     * @return the cause of this Exception. 
     * @see Exception#getCause()
     */
    public Exception getUnderlineEx() {
        if (getCause() instanceof Exception ex) {
            return ex;
        }
        return null;
    }
}
