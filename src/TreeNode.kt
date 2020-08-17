/**
 * Binary search tree with automatic addition of new nodes
 */

class TreeNode(internal val data: Int) {

    var size = 1 // size of subtree
    var left: TreeNode? = null
    var right: TreeNode? = null

    // Find place in binary search tree and add node
    fun insert(d: Int) {
        if (d <= data) {
            if (left == null)
                left = TreeNode(d)
            else
                left!!.insert(d)
        } else {
            if (right == null)
                right = TreeNode(d)
            else
                right!!.insert(d)
        }
        size++
    }

    override fun toString(): String {
        return data.toString()
    }

}