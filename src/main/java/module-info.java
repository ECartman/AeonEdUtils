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

module com.aeongames.edi.utils {
    requires java.base;
    requires transitive java.desktop;
    requires transitive java.datatransfer;
    requires transitive java.logging;
    requires transitive java.management;
    exports com.aeongames.edi.utils.datatransfer.clipboard;
    exports com.aeongames.edi.utils.datatransfer.dnd;
    exports com.aeongames.edi.utils.datatransfer;
    exports com.aeongames.edi.utils.error;
    exports com.aeongames.edi.utils.threading;
    exports com.aeongames.edi.utils.common;
}
