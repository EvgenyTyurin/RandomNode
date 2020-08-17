import kotlin.random.Random

/**
 * Get random node from binary search tree
 */

val random = Random(100);

fun main() {
    // Tree init
    val root = TreeNode(2)
    root.insert(1)
    root.insert(3)
    // Show 100 random nodes from tree
    for (i in 1..100)
        println(getRandomNode(root))
}

// Return random node from tree
fun getRandomNode(node: TreeNode): TreeNode {
    // Get random int from 1 to size of subtree
    val randomInt = random.nextInt(node.size) + 1
    // If random match node data return node
    if (randomInt == node.data)
        return node
    // If random < node.data go to left subtree
    return if (randomInt < node.data) {
        if (node.left == null)
            node
        else
            getRandomNode(node.left!!)
    // If random > node.data go to right subtree
    } else {
        if (node.right == null)
            node
        else
            getRandomNode(node.right!!)
    }
}